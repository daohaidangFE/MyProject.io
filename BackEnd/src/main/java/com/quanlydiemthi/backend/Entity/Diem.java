package com.quanlydiemthi.backend.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
<<<<<<< HEAD
//@Table(name = "diem")
=======
>>>>>>> c2c351c36ed08c27daa2d687e1d4559e5f581c92
public class Diem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String hocKy;

    @Column(nullable = false)
    private Float diemLan1;

    @Column(nullable = false)
    private Float diemLan2;

    @ManyToOne
    @JoinColumn(name="maSV")
    private SinhVien sinhvien;

    @ManyToOne
    @JoinColumn(name="maMH")
    private MonHoc monhoc;
}
