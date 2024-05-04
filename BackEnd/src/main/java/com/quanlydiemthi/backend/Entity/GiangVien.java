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

public class GiangVien {
    @Id
    private String maGV;

    private String tenGV;

    @Column(nullable = false)
    private String username;

    private boolean isActive = true;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String gioiTinh;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @JsonIgnore
    @OneToMany(mappedBy = "giangvien",fetch = FetchType.LAZY)
    private List<MonHoc> monhoc;
}
