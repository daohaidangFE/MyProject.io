package com.quanlydiemthi.backend.Api.Admin;

import com.quanlydiemthi.backend.Payloads.GiangVienDTO;
import com.quanlydiemthi.backend.Payloads.SinhVienDTO;
import com.quanlydiemthi.backend.Service.ISinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiSinhVien {
    @Autowired
    private ISinhVienService sinhVienService;

    @DeleteMapping("/sinhvien/{maSV}")
    public void deleteSinhVien(@PathVariable String maSV) {
        sinhVienService.deleteStudent(maSV);
    }

    @PostMapping("/sinhvien")
    public ResponseEntity<?> addSinhVien(@RequestBody SinhVienDTO sinhVienDTO) {
        SinhVienDTO createSinhVien = sinhVienService.createStudent(sinhVienDTO);
        return ResponseEntity.ok().body(createSinhVien);
    }
}
