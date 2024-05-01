package com.quanlydiemthi.backend.Service.Impl;

import com.quanlydiemthi.backend.Entity.GiangVien;
import com.quanlydiemthi.backend.Exceptions.NotFoundException;
import com.quanlydiemthi.backend.Payloads.GiangVienDTO;
import com.quanlydiemthi.backend.Repository.GiangVienRepository;
import com.quanlydiemthi.backend.Service.IGiangVienService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GiangVienServiceImpl implements IGiangVienService {
    @Autowired
    private GiangVienRepository giangVienRepository;

    @Autowired
    public ModelMapper modelMapper;

    @Override
    public List<GiangVienDTO> findAll() {
        List<GiangVien> giangVien = giangVienRepository.findAll();
        return giangVien.stream()
                .map((giangvien) -> this.modelMapper.map(giangvien, GiangVienDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public GiangVienDTO findGiangVienById(Integer Id) {
        GiangVien giangVien = giangVienRepository.findById(Id).orElseThrow(() -> new NotFoundException("GiangVien", "Id", Id));
        return modelMapper.map(giangVien, GiangVienDTO.class);
    }

    @Override
    public List<GiangVienDTO> searchByFullname(String tenGV) {
        List<GiangVien> giangVien = giangVienRepository.findGiangVienByTenGVContainingIgnoreCase(tenGV);
        return giangVien.stream()
                .map((giangvien) -> this.modelMapper.map(giangvien, GiangVienDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<GiangVienDTO> searchByGioiTinh(String gioiTinh) {
        List<GiangVien> giangVienList = giangVienRepository.findGiangVienByGioiTinhContainingIgnoreCase(gioiTinh);
        return giangVienList.stream()
                .map((giangvien) -> this.modelMapper.map(giangvien, GiangVienDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteGiangVienById(Integer Id) {
        giangVienRepository.deleteById(Id);
    }
}

