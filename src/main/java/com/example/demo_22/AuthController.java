package com.example.demo_22;

import com.example.demo_22.dto.SignInRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/developer/auth")
public class AuthController {

    @PostMapping("/sign-in")
    public String signIn(@RequestBody SignInRequest request) {
        // In a real application, you would authenticate the user here
        if ("tdiopenapi".equals(request.getUsername()) && "TD10p3N4pI".equals(request.getPassword())) {
            return "Authentication successful";
        } else {
            return "Authentication failed";
        }
    }
}
