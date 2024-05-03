package com.quanlydiemthi.backend.Service;

import com.quanlydiemthi.backend.Payloads.SinhVienDTO;

import java.util.List;
import java.util.Map;

public interface ISinhVienService {
    List<SinhVienDTO> findAll();
    SinhVienDTO findSinhVienById(Integer Id);
    void deleteSinhVienById(Integer Id);
    List<SinhVienDTO> searchByFullname(String tenSV);
    List<SinhVienDTO> searchByGioiTinh(String gioiTinh);
    List<SinhVienDTO> findStudents(Map<String, String> params);
}
