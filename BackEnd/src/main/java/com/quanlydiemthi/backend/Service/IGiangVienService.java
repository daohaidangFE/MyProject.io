package com.quanlydiemthi.backend.Service;

import com.quanlydiemthi.backend.Entity.GiangVien;
import com.quanlydiemthi.backend.Payloads.GiangVienDTO;

import java.util.List;
import java.util.Map;

public interface IGiangVienService {
    List<GiangVienDTO> findTeachers(Map<String, String> params);
}
