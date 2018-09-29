package com.ual.des.pocs.springboot;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
@RestController(/test)
@SpringBootApplication
public class Example {
    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "Hello World";
    }
}
