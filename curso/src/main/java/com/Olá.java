package com;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Olá {
    
    @GetMapping(value="/")
    public String getMethodName() {
        return "Olá pessoal";
    }
    
}
