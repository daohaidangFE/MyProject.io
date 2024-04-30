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
public class KhoaHoc {
    @Id
    private Integer maKH;

    @Column(nullable = false)
    private String tenKH;

    @OneToMany(mappedBy = "khoahoc",fetch = FetchType.LAZY)
    private List<Lop> lop;
}
