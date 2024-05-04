package com.quanlydiemthi.backend.Api.Admin;

import com.quanlydiemthi.backend.Service.IGiangVienService;
import com.quanlydiemthi.backend.Service.ISinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiGiangVien {
    @Autowired
    private IGiangVienService giangVienService;

    @DeleteMapping("/giangvien/{maGV}")
    public void deleteGiangVien(@PathVariable String maGV) {
        giangVienService.deleteTeacher(maGV);
    }
}
