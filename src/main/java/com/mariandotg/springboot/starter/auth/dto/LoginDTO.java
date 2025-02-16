package com.mariandotg.springboot.starter.auth.dto;

import lombok.Data;

@Data
public class LoginDTO {
    private String email;
    private String password;
}
