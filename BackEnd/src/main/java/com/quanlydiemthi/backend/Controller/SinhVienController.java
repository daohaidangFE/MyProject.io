package com.quanlydiemthi.backend.Controller;


import com.quanlydiemthi.backend.Payloads.SinhVienDTO;
import com.quanlydiemthi.backend.Service.Impl.SinhVienServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SinhVienController {
    @Autowired
    private SinhVienServiceImpl sinhVienService;

    @GetMapping("/api/sinhvien")
    public ResponseEntity<?> getAllSinhVien() {
        List<SinhVienDTO> sinhVienDTOList = sinhVienService.findAll();
        sinhVienDTOList.forEach(System.out::println);
        return ResponseEntity.ok(sinhVienDTOList);
    }
}
