package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hello {

    @RequestMapping("/")
    public String hello() {
        return "index.html";
    }
}
