package com.quanlydiemthi.backend.Payloads;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.quanlydiemthi.backend.Entity.Diem;
import com.quanlydiemthi.backend.Entity.Lop;
import com.quanlydiemthi.backend.Entity.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SinhVienDTO {

    private Integer maSV;

    private String tenSV;

    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String gioiTinh;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Role role;

    private List<Diem> diem;

    private Lop lop;
}
