package com.dev.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.backend.dto.ClientPersonRequestDTO;
import com.dev.backend.entity.Person;
import com.dev.backend.service.ClientPersonService;

@RestController
@RequestMapping("/api/client")
public class ClientPersonControler {

    @Autowired
    private ClientPersonService clientPersonService;


    @PostMapping("/")
    public Person inserir(@RequestBody ClientPersonRequestDTO clientPersonRequestDTO){
        return clientPersonService.registrar(clientPersonRequestDTO);

    }

    
}
