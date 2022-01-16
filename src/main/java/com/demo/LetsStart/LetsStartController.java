package com.demo.LetsStart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LetsStartController {

    @GetMapping("/lets_start")
    String letsStart(){
        return "Lets Start Application";
    }
}
