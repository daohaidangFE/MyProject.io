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

public class Khoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maK;

    @Column(nullable = false)
    private String tenK;

    @OneToMany(mappedBy = "khoa",fetch = FetchType.LAZY)
    private List<Lop> lop;
}
