package com.quanlydiemthi.backend.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "lop")
public class Lop {
    @Id
    private Integer maLop;

    @Column(nullable = false)
    private String tenLop;

    @OneToMany(mappedBy = "lop",fetch = FetchType.LAZY)
    private List<SinhVien> sinhvien;

    @ManyToOne
    @JoinColumn(name = "maKH")
    private KhoaHoc khoahoc;

    @ManyToOne
    @JoinColumn(name = "maK")
    private Khoa khoa;

}
