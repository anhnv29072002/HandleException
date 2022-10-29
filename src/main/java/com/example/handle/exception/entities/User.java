package com.example.handle.exception.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Không được để trống")
    @Size(min = 6, max = 25, message = "Phải từ 6 đến 25 ký tự")
    @Column
    private String username;
    @NotBlank(message = "Không được để trống")
    @Size(min = 6, max = 25, message = "Phải từ 6 đến 25 ký tự")
    @Column
    private String password;
    @Column
    private String note;

    @Column
    private String role;

    public User() {

    }
}

