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
@Table(name = "giang_vien")
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
