package com.quanlydiemthi.backend.Service.Impl;


import com.quanlydiemthi.backend.Entity.SinhVien;
import com.quanlydiemthi.backend.Exceptions.NotFoundException;
import com.quanlydiemthi.backend.Payloads.SinhVienDTO;
import com.quanlydiemthi.backend.Repository.SinhVienRepository;
import com.quanlydiemthi.backend.Service.ISinhVienService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SinhVienServiceImpl implements ISinhVienService {
    @Autowired
    private SinhVienRepository sinhvienRepository;

    @Autowired
    public ModelMapper modelMapper;

    @Override
    public List<SinhVienDTO> findStudents(Map<String, String> params) {
        List<SinhVien> sinhVienList = sinhvienRepository.findStudents(params);
        return sinhVienList.stream()
                .map((sinhvien) -> this.modelMapper.map(sinhvien, SinhVienDTO.class))
                .collect((Collectors.toList()));
    }

    @Override
    public void deleteSinhVienById(Integer Id) {
        sinhvienRepository.deleteById(Id);
    }

}
