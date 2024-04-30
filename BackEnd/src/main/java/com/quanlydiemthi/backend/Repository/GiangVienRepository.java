package com.quanlydiemthi.backend.Repository;

import com.quanlydiemthi.backend.Entity.GiangVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GiangVienRepository extends JpaRepository<GiangVien, Integer> {
    List<GiangVien> findGiangVienByTenGVContainingIgnoreCase(String tenGV);
    List<GiangVien> findGiangVienByGioiTinhContainingIgnoreCase(String gioiTinh);
}
