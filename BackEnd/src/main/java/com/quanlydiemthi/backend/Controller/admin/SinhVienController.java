package com.quanlydiemthi.backend.Controller.admin;

import com.quanlydiemthi.backend.Payloads.SinhVienDTO;
import com.quanlydiemthi.backend.Service.ISinhVienService;
import com.quanlydiemthi.backend.Service.Impl.SinhVienServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class SinhVienController {
    @Autowired
    private ISinhVienService sinhVienService;

    @GetMapping("/sinhvien")
    public String getAllSinhVien(@RequestParam Map<String, String> params, Model model) {
        List<SinhVienDTO> sinhVienDTOList = sinhVienService.findStudents(params);
        model.addAttribute("sinhVienDTOList", sinhVienDTOList);
        return "/dashboard/sinhvien";
    }

//    @DeleteMapping
//    public ResponseEntity<?> deleteSinhVienById(@PathVariable int id) {
//        sinhVienService.deleteSinhVienById(id);
//        return new ResponseEntity<>(new ApiResponse<>("Sinh vien was deleted sucessfully", true), HttpStatus.OK);
//    }

}
