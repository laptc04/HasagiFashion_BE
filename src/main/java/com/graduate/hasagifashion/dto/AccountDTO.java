package com.graduate.hasagifashion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {
    private Long id;
    private String fullName;
    private String email;
    private String password;
    private String avatar;
    private boolean isDelete;
    private RoleDTO role;

    public AccountDTO(Long id, String fullName, String email, String password, String avatar, Boolean isDeleted) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.avatar = avatar;
        this.isDelete = isDeleted;
    }
}
