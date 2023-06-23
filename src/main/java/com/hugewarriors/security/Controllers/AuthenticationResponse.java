package com.hugewarriors.security.Controllers;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@RequiredArgsConstructor
public class AuthenticationResponse {
    private String token;
}
