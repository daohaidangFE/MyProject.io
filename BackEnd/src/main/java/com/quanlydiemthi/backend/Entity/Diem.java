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
//@Table(name = "diem")
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
