package com.quanlydiemthi.backend.Controller.admin;


import com.quanlydiemthi.backend.Payloads.MonHocDTO;
import com.quanlydiemthi.backend.Service.Impl.MonHocServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MonHocController {
    @Autowired
    private MonHocServiceImpl monHocService;

    @GetMapping("/api/monhoc")
    public ResponseEntity<?> getAllMonHoc() {
        List<MonHocDTO> monHocDTOList = monHocService.findAll();
        return ResponseEntity.ok(monHocDTOList);
    }

    @GetMapping("/api/monhoc/{id}")
    public ResponseEntity<?> getMonHocById(@PathVariable Integer id) {
        MonHocDTO monHocDTO = monHocService.findMonHocById(id);
        return ResponseEntity.ok(monHocDTO);
    }

    @GetMapping("/api/monhoc/searchbyname")
    public ResponseEntity<?> getMonHocByName(@RequestParam String searchValue) {
        List<MonHocDTO> monHocDTOList = monHocService.searchMonHocByTenMH(searchValue.replaceAll("\s\s+", " ").trim());
        return ResponseEntity.ok(monHocDTOList);
    }

}
