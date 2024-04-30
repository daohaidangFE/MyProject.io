package com.quanlydiemthi.backend.Service;

import com.quanlydiemthi.backend.Entity.GiangVien;
import com.quanlydiemthi.backend.Payloads.GiangVienDTO;

import java.util.List;

public interface IGiangVienService {
    List<GiangVienDTO> findAll();
    GiangVienDTO findGiangVienById(Integer id);
    void deleteGiangVienById(Integer id);
    List<GiangVienDTO> searchByFullname(String tenGV);
    List<GiangVienDTO> searchByGioiTinh(String gioiTinh);
}
