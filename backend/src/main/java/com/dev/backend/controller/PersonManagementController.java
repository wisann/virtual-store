package com.dev.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.backend.service.PersonManagementService;

@RestController
@RequestMapping("/api/person-management")
public class PersonManagementController {

    @Autowired
    private PersonManagementService personManagementService;

    @PostMapping("/")
    public String recoverCode(@RequestParam ("email") String email){
        return personManagementService.solicitarCodigo(email);
        
    }
    
}
