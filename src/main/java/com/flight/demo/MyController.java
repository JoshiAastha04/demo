package com.flight.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/mitaindex")
    public String index() {
        return "mitaindex";
    }
}