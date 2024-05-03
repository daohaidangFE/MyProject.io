package com.quanlydiemthi.backend.Controller.admin;


import com.quanlydiemthi.backend.Payloads.KhoaDTO;
import com.quanlydiemthi.backend.Service.Impl.KhoaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KhoaController {
    @Autowired
    private KhoaServiceImpl khoaService;

    @GetMapping("/api/khoa")
    public ResponseEntity<?> getAllKhoa() {
        List<KhoaDTO> khoaDTOList = khoaService.findAll();
        return ResponseEntity.ok(khoaDTOList);
    }

    @GetMapping("/api/khoa/{id}")
    public ResponseEntity<?> getKhoaById(@PathVariable Integer id) {
        KhoaDTO khoaDTO = khoaService.findKhoaById(id);
        return ResponseEntity.ok(khoaDTO);
    }

    @GetMapping("/api/khoa/searchbyname")
    public ResponseEntity<?> searchKhoaByTenK(@RequestParam String searchValue) {
        List<KhoaDTO> khoaDTOList = khoaService.findByTenKhoa(searchValue.replaceAll("\s\s+", " ").trim());
        return ResponseEntity.ok(khoaDTOList);
    }
}
