package com.trial.anon.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
public class landing_controller implements WebMvcConfigurer {
//    @GetMapping("/")
    public void show_landing_page(){

    }
}
