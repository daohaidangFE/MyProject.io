package com.quanlydiemthi.backend.Controller.admin;


import com.quanlydiemthi.backend.Payloads.Response.ApiResponse;
import com.quanlydiemthi.backend.Payloads.SinhVienDTO;
import com.quanlydiemthi.backend.Service.Impl.SinhVienServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD:BackEnd/src/main/java/com/quanlydiemthi/backend/Controller/admin/SinhVienController.java
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
=======
import org.springframework.web.bind.annotation.*;
>>>>>>> c2c351c36ed08c27daa2d687e1d4559e5f581c92:BackEnd/src/main/java/com/quanlydiemthi/backend/Controller/SinhVienController.java

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
<<<<<<< HEAD:BackEnd/src/main/java/com/quanlydiemthi/backend/Controller/admin/SinhVienController.java
        model.addAttribute("sinhVienDTOList", sinhVienDTOList);
        return "/dashboard/sinhvien";
    }

=======
//        sinhVienDTOList.forEach(System.out::println); đánh debug
        return ResponseEntity.ok(sinhVienDTOList);
    }

    @GetMapping("/api/sinhvien/{id}")
    public ResponseEntity<?> getSinhVienById(@PathVariable int id) {
        return  ResponseEntity.ok(sinhVienService.findSinhVienById(id));
    }

    @GetMapping("/api/sinhvien/searchbyname")
    public ResponseEntity<?> searchSinhVienByFullname(@RequestParam String searchValue) {
        return ResponseEntity.ok(sinhVienService.searchByFullname(searchValue.replaceAll("\s\s+", " ").trim()));
    }

    @GetMapping("/api/sinhvien/searchbysex")
    public ResponseEntity<?> searchSinhVienByGioiTinh(@RequestParam String searchValue) {
        return ResponseEntity.ok(sinhVienService.searchByGioiTinh(searchValue));
    }

    @DeleteMapping("/api/sinhvien/{id}")
    public ResponseEntity<?> deleteSinhVienById(@PathVariable int id) {
        sinhVienService.deleteSinhVienById(id);
        return new ResponseEntity<>(new ApiResponse<>("Sinh vien was deleted sucessfully", true), HttpStatus.OK);
    }

>>>>>>> c2c351c36ed08c27daa2d687e1d4559e5f581c92:BackEnd/src/main/java/com/quanlydiemthi/backend/Controller/SinhVienController.java
}
