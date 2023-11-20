package com.example.demo.dtos.request;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter@Setter
public class RegisterRequest {
    private String email;
    private String password;
}
