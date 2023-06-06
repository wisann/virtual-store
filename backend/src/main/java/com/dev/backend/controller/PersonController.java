package com.dev.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.backend.entity.Person;
import com.dev.backend.service.PersonService;

@RestController
@RequestMapping("api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public List<Person> buscarTodos(){
        return personService.buscarTodos();
    }

    @PostMapping("/")
    public Person inserir(@RequestBody Person person){
        return personService.inserir(person);
    }

    @PutMapping("/")
    public Person alterar(@RequestBody Person person){
        return personService.alterar(person);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Void> excluir (@PathVariable ("id") Long id){
        personService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
