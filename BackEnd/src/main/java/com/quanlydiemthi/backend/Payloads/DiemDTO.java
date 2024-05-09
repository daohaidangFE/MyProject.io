package com.quanlydiemthi.backend.Payloads;

import com.quanlydiemthi.backend.Entity.MonHoc;
import com.quanlydiemthi.backend.Entity.SinhVien;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class DiemDTO {
    private Integer id;

    private String hocKy;

    private Float diemGiuaKy;

    private Float diemCuoiKy;

    private Float diemTongKet;

    private SinhVien sinhvien;

    private MonHoc monhoc;
}
