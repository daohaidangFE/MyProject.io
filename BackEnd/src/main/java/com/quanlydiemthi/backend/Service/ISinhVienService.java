package com.quanlydiemthi.backend.Service;

import com.quanlydiemthi.backend.Payloads.SinhVienDTO;

import java.util.List;

public interface ISinhVienService {
    List<SinhVienDTO> findAll();
    SinhVienDTO findSinhVienById(Integer Id);
    void deleteSinhVienById(Integer Id);
    List<SinhVienDTO> searchByFullname(String tenSV);
}
