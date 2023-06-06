package com.dev.backend.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.entity.Person;
import com.dev.backend.repository.PersonRepository;

@Service
public class PersonManagementService {

    @Autowired
    private EmailService emailService;

    @Autowired
    private PersonRepository personRepository;

    public String solicitarCodigo(String email) {
        Person person = personRepository.findByEmail(email);
        person.setCodigoRecuperacaoSenha(getCodigoRecuperacaoSenha(person.getId()));
        person.setDataEnvioCodigo(new Date());
        personRepository.saveAndFlush(person);
        emailService.sendEmail(person.getEmail(), "Password recovery code",
                "This is your recovery code: " + person.getCodigoRecuperacaoSenha());

        return "Code sent!";
    }

    private String getCodigoRecuperacaoSenha(Long id) {
        DateFormat format = new SimpleDateFormat("ddMMyyyyHHmmssmm");
        return format.format(new Date()) + id;
    }

}
