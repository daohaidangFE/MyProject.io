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
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class GiangVienServiceImpl implements IGiangVienService {
    @Autowired
    private GiangVienRepository giangVienRepository;

    @Autowired
    public ModelMapper modelMapper;

    @Override
    public List<GiangVienDTO> findTeachers(Map<String, String> params) {
        List<GiangVien> giangVienList = giangVienRepository.findTeachers(params);
        return giangVienList.stream()
                .map((giangvien) -> this.modelMapper.map(giangvien, GiangVienDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteTeacher(String maGV) {
        GiangVien giangVien1 = giangVienRepository.findByMaGV(maGV);
        giangVien1.setActive(false);
        giangVienRepository.save(giangVien1);
    }
}

