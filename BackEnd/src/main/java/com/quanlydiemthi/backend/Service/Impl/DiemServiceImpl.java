package com.quanlydiemthi.backend.Service.Impl;


import com.quanlydiemthi.backend.Entity.Diem;
import com.quanlydiemthi.backend.Entity.MonHoc;
import com.quanlydiemthi.backend.Payloads.DiemDTO;
import com.quanlydiemthi.backend.Repository.DiemRepository;
import com.quanlydiemthi.backend.Service.IDiemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class DiemServiceImpl implements IDiemService {
    @Autowired
    private DiemRepository diemRepository;

    @Autowired
    public ModelMapper modelMapper;

    @Override
    public List<DiemDTO> findAll() {
        List<Diem> diems = diemRepository.findAll();
        List<DiemDTO> diemDTOList = new ArrayList<>();
        for(Diem diem : diems) {
            DiemDTO dto = new DiemDTO();
            Float Dtb = (float) (diem.getDiemGiuaKy()*0.3 + diem.getDiemCuoiKy()*0.7);
            dto.setDiemTongKet(Dtb);
            this.modelMapper.map(diem, dto);
            diemDTOList.add(dto);
        }
        return diemDTOList;
    }

    @Override
    public DiemDTO findByMaSV(String maSV) {
        return null;
    }

    @Override
    public void deleteDiem(Integer Id) {
        diemRepository.deleteById(Id);
    }
}
