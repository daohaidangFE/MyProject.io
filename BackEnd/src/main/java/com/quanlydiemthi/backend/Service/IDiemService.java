package com.quanlydiemthi.backend.Service;


import com.quanlydiemthi.backend.Entity.Diem;
import com.quanlydiemthi.backend.Payloads.DiemDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IDiemService {
    List<DiemDTO> findAll();
    DiemDTO findByMaSV(String maSV);
}