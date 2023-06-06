package com.dev.backend.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.dto.ClientPersonRequestDTO;
import com.dev.backend.entity.Person;
import com.dev.backend.repository.ClientPersonRepository;

@Service
public class ClientPersonService {

    @Autowired
    private ClientPersonRepository clientPersonRepository;

    @Autowired
    private PersonPermissionService personPermissionService;

    @Autowired
    private EmailService emailService;


    public Person registrar(ClientPersonRequestDTO clientPersonRequestDTO){
        Person person = new ClientPersonRequestDTO().converter(clientPersonRequestDTO);
        person.setDataAtualiacao(new Date());
        Person newPerson = clientPersonRepository.saveAndFlush(person);
        personPermissionService.linkClientPersonPermission(newPerson);
        emailService.sendEmail(newPerson.getEmail(), "Welcome to Wisan's virtual store!", "The registration was successful! You will receive the password by email shortly");
        return newPerson;

    }
}
