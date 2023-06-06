package com.dev.backend.controller;

import java.util.Date;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Configuration
@PropertySource(value = "classpath:application.properties")
@EnableAutoConfiguration
@RestController
@RequestMapping("/api")
public class Hello {
    @GetMapping("/")
    public String hello(){
        return "Ola mundo Spring" + new Date();

    }
    
}
