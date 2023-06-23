package com.hugewarriors.security.Controllers;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@RequiredArgsConstructor
@SuperBuilder
public class AuthenticationRequest {
    private String email;
    private String password;
}
