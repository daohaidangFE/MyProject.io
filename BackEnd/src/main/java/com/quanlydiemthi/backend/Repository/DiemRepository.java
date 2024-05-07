package com.quanlydiemthi.backend.Repository;

import com.quanlydiemthi.backend.Entity.Diem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiemRepository extends JpaRepository<Diem, Integer> {
}
