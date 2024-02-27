package com.ltp.hellospring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class RestGradeController {
    @GetMapping("/")
    public String Rest() {
        return "Hello, Spring!!";
    }
}
