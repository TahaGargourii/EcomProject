package com.example.ecommerceProject.controller;

import com.example.ecommerceProject.security.dto.LoginRequest;
import com.example.ecommerceProject.security.dto.LoginResponse;
import com.example.ecommerceProject.security.jwt.JwtTokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * Created on Ağustos, 2020
 *
 * @author Faruk
 */
@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {

    private final JwtTokenService jwtTokenService;

    @PostMapping
    public ResponseEntity<LoginResponse> loginRequest(@RequestBody LoginRequest loginRequest) {

        final LoginResponse loginResponse = jwtTokenService.getLoginResponse(loginRequest);

        return ResponseEntity.ok(loginResponse);
    }

}
