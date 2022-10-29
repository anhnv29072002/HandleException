package com.example.handle.exception.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
