package com.quanlydiemthi.backend.Repository;

import com.quanlydiemthi.backend.Entity.Lop;
import com.quanlydiemthi.backend.Entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LopRepository extends JpaRepository<Lop, Integer> {
    List<Lop> searchAllByTenLopContainingIgnoreCase(String tenLop);
    Lop findByMaLop(String maLop);
}