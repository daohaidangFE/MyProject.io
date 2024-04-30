package com.quanlydiemthi.backend.Controller;


import com.quanlydiemthi.backend.Payloads.Response.ApiResponse;
import com.quanlydiemthi.backend.Payloads.SinhVienDTO;
import com.quanlydiemthi.backend.Service.Impl.SinhVienServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SinhVienController {
    @Autowired
    private SinhVienServiceImpl sinhVienService;

    @GetMapping("/api/sinhvien")
    public ResponseEntity<?> getAllSinhVien() {
        List<SinhVienDTO> sinhVienDTOList = sinhVienService.findAll();
//        sinhVienDTOList.forEach(System.out::println); đánh debug
        return ResponseEntity.ok(sinhVienDTOList);
    }

    @GetMapping("/api/sinhvien/{id}")
    public ResponseEntity<?> getSinhVienById(@PathVariable int id) {
        return  ResponseEntity.ok(sinhVienService.findSinhVienById(id));
    }

    @GetMapping("api/sinhvien/search")
    public ResponseEntity<?> searchSinhVien(@RequestParam String searchValue) {
        return ResponseEntity.ok(sinhVienService.searchByFullname(searchValue));
    }

    @DeleteMapping("/api/sinhvien/{id}")
    public ResponseEntity<?> deleteSinhVienById(@PathVariable int id) {
        sinhVienService.deleteSinhVienById(id);
        return new ResponseEntity<>(new ApiResponse<>("Sinh vien was deleted sucessfully", true), HttpStatus.OK);
    }

}
