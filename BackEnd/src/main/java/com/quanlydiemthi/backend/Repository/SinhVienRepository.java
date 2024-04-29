package com.quanlydiemthi.backend.Repository;

import com.quanlydiemthi.backend.Entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, Integer> {

}
