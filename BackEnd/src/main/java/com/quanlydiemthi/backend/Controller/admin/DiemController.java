package com.quanlydiemthi.backend.Controller.admin;


import com.quanlydiemthi.backend.Payloads.DiemDTO;
import com.quanlydiemthi.backend.Service.Impl.DiemServiceImpl;
import jakarta.xml.ws.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DiemController {
    @Autowired
    private DiemServiceImpl diemService;


    @GetMapping("/diemthi")
    public ResponseEntity<?> getAllDiem() {
        List<DiemDTO> diemDTOList = diemService.findAll();
        return ResponseEntity.ok(diemDTOList);
    }

}
