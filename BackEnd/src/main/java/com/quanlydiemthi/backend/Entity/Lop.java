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
<<<<<<< HEAD
//@Table(name = "lop")
=======
>>>>>>> c2c351c36ed08c27daa2d687e1d4559e5f581c92
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
