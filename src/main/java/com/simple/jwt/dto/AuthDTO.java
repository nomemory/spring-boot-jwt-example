package com.simple.jwt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthDTO
{
    private String userName;
    private String passWord;
}
