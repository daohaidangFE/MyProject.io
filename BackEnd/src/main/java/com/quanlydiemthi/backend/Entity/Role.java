package com.quanlydiemthi.backend.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role_name")
    private String role;

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private List<GiangVien> giangVienList;
}
