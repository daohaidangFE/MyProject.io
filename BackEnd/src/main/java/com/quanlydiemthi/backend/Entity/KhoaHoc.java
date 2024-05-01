package com.quanlydiemthi.backend.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
<<<<<<< HEAD
//@Table(name = "khoa_hoc")
=======
>>>>>>> c2c351c36ed08c27daa2d687e1d4559e5f581c92
public class KhoaHoc {
    @Id
    private Integer maKH;

    @Column(nullable = false)
    private String tenKH;

    @OneToMany(mappedBy = "khoahoc",fetch = FetchType.LAZY)
    private List<Lop> lop;
}
