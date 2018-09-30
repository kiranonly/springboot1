package com.ual.des.pocs.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {
    @RequestMapping("hello")
    String greet() {
        return "hello!!!!";
    }
}
