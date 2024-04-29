package com.quanlydiemthi.backend.Payloads;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.quanlydiemthi.backend.Entity.Role;
import jakarta.persistence.Column;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class GiangVienDTO {
    private Integer maGV;

    private String tenGV;

    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String gioiTinh;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Role role;
}
