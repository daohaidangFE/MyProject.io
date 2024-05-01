package com.quanlydiemthi.backend.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
//@Table(name = "mon_hoc")
=======
>>>>>>> c2c351c36ed08c27daa2d687e1d4559e5f581c92
public class MonHoc {
    @Id
    private Integer maMH;

    @Column(nullable = false)
    private String tenMH;

    @Column(nullable = false)
    private Integer soTinChi;

    @OneToMany(mappedBy = "monhoc",fetch = FetchType.LAZY)
        private List<Diem> diem;

    @ManyToOne
    @JoinColumn(name = "maGV")
    private GiangVien giangvien;
}
