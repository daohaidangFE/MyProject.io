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
//@Table(name = "khoa")
=======
>>>>>>> c2c351c36ed08c27daa2d687e1d4559e5f581c92
public class Khoa {
    @Id
    private Integer maK;

    @Column(nullable = false)
    private String tenK;

    @OneToMany(mappedBy = "khoa",fetch = FetchType.LAZY)
    private List<Lop> lop;
}
