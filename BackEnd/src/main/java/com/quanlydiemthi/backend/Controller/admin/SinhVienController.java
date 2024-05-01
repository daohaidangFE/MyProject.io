package com.quanlydiemthi.backend.Controller.admin;


import com.quanlydiemthi.backend.Payloads.SinhVienDTO;
import com.quanlydiemthi.backend.Service.Impl.SinhVienServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SinhVienController {
    @Autowired
    private SinhVienServiceImpl sinhVienService;
//    @GetMapping("/hello")
//    public String hello(Model model) {
//        model.addAttribute("message", "Hello Thymeleaf!");
//        return "hello";
//    }
    @GetMapping("/api/sinhvien")
    public String getAllSinhVien(Model model) {
        List<SinhVienDTO> sinhVienDTOList = sinhVienService.findAll();
        model.addAttribute("sinhVienDTOList", sinhVienDTOList);
        return "/dashboard/sinhvien";
    }

}
