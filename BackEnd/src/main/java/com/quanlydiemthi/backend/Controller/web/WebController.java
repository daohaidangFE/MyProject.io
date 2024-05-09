package com.quanlydiemthi.backend.Controller.web;

import com.quanlydiemthi.backend.Entity.GiangVien;
import com.quanlydiemthi.backend.Entity.SinhVien;
import com.quanlydiemthi.backend.Payloads.DiemDTO;
import com.quanlydiemthi.backend.Payloads.GiangVienDTO;
import com.quanlydiemthi.backend.Payloads.SinhVienDTO;
import com.quanlydiemthi.backend.Payloads.UserDTO;
import com.quanlydiemthi.backend.Repository.GiangVienRepository;
import com.quanlydiemthi.backend.Service.IDiemService;
import com.quanlydiemthi.backend.Service.IGiangVienService;
import com.quanlydiemthi.backend.Service.ILopService;
import com.quanlydiemthi.backend.Service.ISinhVienService;
import com.quanlydiemthi.backend.Service.Impl.DiemServiceImpl;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WebController {
    @Autowired
    private ISinhVienService sinhVienService;

    @Autowired
    private IGiangVienService giangVienService;

    @Autowired
    private ILopService lopService;

    @Autowired
    private IDiemService diemService;


    @GetMapping("/home")
    public String home() {
        return "/user/sinhvien/indexsv";
    }

    @GetMapping("/diemthi")
    public String  getAllDiem(Model model, HttpSession session) {
        Object loggedInUser = session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            if (loggedInUser instanceof SinhVien sinhVien) {
                List<DiemDTO> diemDTOList = diemService.findByMaSV(sinhVien.getMaSV());
                model.addAttribute("diemtList", diemDTOList);
                return "/user/sinhvien/diemthi";
            }
            else {
                return "redirect:/";
            }
        } else {
            return "redirect:/";
        }

    }

    @GetMapping("/ttcanhan")
    public String  getTtcanhan(Model model, HttpSession session) {
        Object loggedInUser = session.getAttribute("loggedInUser");

        if (loggedInUser != null) {

            String username;
            if (loggedInUser instanceof SinhVien sinhVien) {

                username = sinhVien.getUsername();
                SinhVien sinhVienlog = sinhVienService.findByUsername(username);
                model.addAttribute("sinhVienlog", sinhVienlog);
                return "/user/sinhvien/ttcanhan";
            }  else {
                return "redirect:/";
            }
            // còn phần else if cho sinh viên nữa

        } else {
            return "redirect:/";
        }

    }

    @GetMapping("/")
    public String loginForm() {
        return "/public/login";
    }

    @PostMapping("/login")
    public String login(UserDTO userDTO, HttpSession session) {
        if(userDTO.getUsername().startsWith("KM")){
            GiangVien giangVien = giangVienService.findByUserName(userDTO.getUsername());
            if (giangVien != null && giangVien.getUsername().equals(userDTO.getUsername()) && giangVien.getPassword().equals(userDTO.getPassword())) {
                session.setAttribute("loggedInUser", giangVien);
                return "redirect:/homeGV";
            } else {
                return "redirect:/";
            }
        }
        else{
            SinhVien sinhVien = sinhVienService.findByUsername(userDTO.getUsername());
            if (sinhVien != null && sinhVien.getUsername().equals(userDTO.getUsername()) && sinhVien.getPassword().equals(userDTO.getPassword())) {
                session.setAttribute("loggedInUser", sinhVien);
                return "redirect:/home";
            } else {
                return "redirect:/";
            }
        }
    }

    @GetMapping("/homeGV")
    public String homeGV() {
        return "/user/giangvien/indexgv";
    }

    @GetMapping("/ttcanhanGV")
    public String getTtcanhanGV(Model model, HttpSession session) {
        // Lấy thông tin đăng nhập từ session
        Object loggedInUser = session.getAttribute("loggedInUser");

        if (loggedInUser != null) {

            String username;
            if (loggedInUser instanceof GiangVien giangVien) {

                username = giangVien.getUsername();
                GiangVien giangVienlog = giangVienService.findByUserName(username);
                model.addAttribute("giangVienlog", giangVienlog);
                return "/user/giangvien/ttcanhan";
            }
            else {
                return "redirect:/";
            }
        } else {
            return "redirect:/";
        }
    }

    @GetMapping("/lop")
    public String getLopOfGiangVien(Model model, HttpSession session) {
        Object loggedInUser = session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            if (loggedInUser instanceof GiangVien giangVien) {
                List<SinhVien> sinhVienList = lopService.findAllSinhVienByLop(giangVien.getLop().getMaLop());
                GiangVien giangVienlog = giangVienService.findByUserName(giangVien.getUsername());
                model.addAttribute("sinhVienList", sinhVienList);
                model.addAttribute("giangVienlog", giangVienlog);
                return "/user/giangvien/lop";

            } else {
                return "redirect:/";
            }
        } else {
            return "redirect:/";
        }
    }
}
