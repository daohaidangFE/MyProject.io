package com.quanlydiemthi.backend.Service.Impl;


import com.quanlydiemthi.backend.Entity.Diem;
import com.quanlydiemthi.backend.Payloads.DiemDTO;
import com.quanlydiemthi.backend.Repository.DiemRepository;
import com.quanlydiemthi.backend.Service.IDiemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiemServiceImpl implements IDiemService {

    @Autowired
    private DiemRepository diemRepository;

    @Autowired
    public ModelMapper modelMapper;

    @Override
    public List<DiemDTO> findAll() {
        List<Diem> diems = diemRepository.findAll();
        return diems.stream()
                .map((diem) -> this.modelMapper.map(diem,DiemDTO.class))
                .collect(Collectors.toList());
    }
}
