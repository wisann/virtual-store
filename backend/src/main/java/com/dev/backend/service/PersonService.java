package com.dev.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.entity.Person;
import com.dev.backend.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List <Person> buscarTodos(){
        return personRepository.findAll();
    }

    public Person inserir(Person person){
        person.setDataCriacao(new Date());
        Person newPerson = personRepository.saveAndFlush(person);
        return newPerson;
    }

    public Person alterar(Person person){
        person.setDataAtualiacao(new Date());
        return personRepository.saveAndFlush(person);
    }

    public void excluir(Long id){
        Person person = personRepository.findById(id).get();
        personRepository.delete(person);
    }

   

}
