package com.simple.jwt.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User
{
    public static final String ROLE_ADMIN = "ADM";
    public static final String ROLE_USER = "USR";

    private String userName;
    private String passWord;
    private String email;
    private String description;
    private String role;
    private Boolean isActivated;
    private Boolean isAdmin;
}
