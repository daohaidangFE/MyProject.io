package com.quanlydiemthi.backend.Service.Impl;


import com.quanlydiemthi.backend.Entity.SinhVien;
import com.quanlydiemthi.backend.Exceptions.NotFoundException;
import com.quanlydiemthi.backend.Payloads.SinhVienDTO;
import com.quanlydiemthi.backend.Repository.SinhVienRepository;
import com.quanlydiemthi.backend.Service.ISinhVienService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SinhVienServiceImpl implements ISinhVienService {
    @Autowired
    private SinhVienRepository sinhvienRepository;

    @Autowired
    public ModelMapper modelMapper;

    @Override
    public List<SinhVienDTO> findAll() {
        List<SinhVien> sinhVien = sinhvienRepository.findAll();
        return sinhVien.stream()
                .map((sinhvien) -> this.modelMapper.map(sinhvien, SinhVienDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public SinhVienDTO findSinhVienById(Integer Id) {
        SinhVien sinhvien = sinhvienRepository.findById(Id).orElseThrow(()->new NotFoundException("SinhVien", "Id", Id));
        return modelMapper.map(sinhvien, SinhVienDTO.class);
    }

    @Override
    public List<SinhVienDTO> searchByFullname(String tenSV) {
        return sinhvienRepository.findAllByTenSVContainingIgnoreCase(tenSV).stream()
                .map((sinhvien) -> this.modelMapper.map(sinhvien, SinhVienDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteSinhVienById(Integer Id) {
        sinhvienRepository.deleteById(Id);
    }

}
