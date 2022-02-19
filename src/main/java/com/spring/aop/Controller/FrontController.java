package com.spring.aop.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

    @GetMapping("/demo")
    public String demo() {
        return new String("sdaasd");
    }
}
