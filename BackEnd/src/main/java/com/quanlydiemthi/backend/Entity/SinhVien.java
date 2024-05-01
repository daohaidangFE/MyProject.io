package com.quanlydiemthi.backend.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@Table(name="sinh_vien")
public class SinhVien {
    @Id
    private Integer maSV;

    private String tenSV;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String gioiTinh;

    @Column(nullable = false)
    private Role role;

    @OneToMany(mappedBy = "sinhvien",fetch = FetchType.LAZY)
    private List<Diem> diem;

    @ManyToOne
    @JoinColumn(name = "maLop")
    private Lop lop;
}
