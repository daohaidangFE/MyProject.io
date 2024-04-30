package com.quanlydiemthi.backend.Controller;


import com.quanlydiemthi.backend.Entity.GiangVien;
import com.quanlydiemthi.backend.Payloads.GiangVienDTO;
import com.quanlydiemthi.backend.Payloads.Response.ApiResponse;
import com.quanlydiemthi.backend.Payloads.SinhVienDTO;
import com.quanlydiemthi.backend.Service.Impl.GiangVienServiceImpl;
import com.quanlydiemthi.backend.Service.Impl.SinhVienServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GiangVienController {
    @Autowired
    private GiangVienServiceImpl giangVienService;

    @GetMapping("/api/giangvien")
    public ResponseEntity<?> getAllGiangVien() {
        List<GiangVienDTO> giangVienDTOList = giangVienService.findAll();
//        giangVienDTOList.forEach(System.out::println); đánh debug
        return ResponseEntity.ok(giangVienDTOList);
    }

    @GetMapping("api/giangvien/{id}")
    public ResponseEntity<?> getGiangVienById(@PathVariable Integer id) {
        GiangVienDTO giangVienDTO = giangVienService.findGiangVienById(id);
        return ResponseEntity.ok(giangVienDTO);
    }

    @GetMapping("api/giangvien/search")
    public ResponseEntity<?> searchGiangVien(@RequestParam String searchValue) {
        List<GiangVienDTO> giangVienDTOList = giangVienService.searchByFullname(searchValue);
        return ResponseEntity.ok(giangVienDTOList);
    }

    @DeleteMapping("api/giangvien/{id}")
    public ResponseEntity<?> deleteGiangVien(@PathVariable Integer id) {
        giangVienService.deleteGiangVienById(id);
        return new ResponseEntity<>(new ApiResponse<>("Giang vien was deleted sucessfull", true), HttpStatus.OK);
    }
}
