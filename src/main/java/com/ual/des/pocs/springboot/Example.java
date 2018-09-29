package com.ual.des.pocs.springboot;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
@RestController
public class Example {
   
     @GetMapping("/")
    String greet() {
        return "hello!!!!";
    }
}
