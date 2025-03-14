package com.org.cadastro;

import org.springframework.web.bind.annotation.GetMapping;

public class Hello {

    // @Override
    @GetMapping("/hello")
    public String hello() {
        return "Hello []";
    }
}