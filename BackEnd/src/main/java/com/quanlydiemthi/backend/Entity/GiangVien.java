package com.quanlydiemthi.backend.Entity;

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
//@Table(name = "giang_vien")
=======
>>>>>>> c2c351c36ed08c27daa2d687e1d4559e5f581c92
public class GiangVien {
    @Id
    private Integer maGV;

    @Column(nullable = false)
    private String tenGV;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String gioiTinh;

    @Column(nullable = false)
    private Role role;

    @OneToMany(mappedBy = "giangvien",fetch = FetchType.LAZY)
    private List<MonHoc> monhoc;
}
