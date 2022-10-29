package com.example.handle.exception.request;

import lombok.Data;

import javax.persistence.Column;

@Data
public class UserRequest {
    private Long id;
    private String username;
    private String password;
    private String note;
    private String role;
}
