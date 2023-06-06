package com.dev.backend.dto;

import org.springframework.beans.BeanUtils;

import com.dev.backend.entity.City;
import com.dev.backend.entity.Person;

import lombok.Data;

@Data
public class ClientPersonRequestDTO {
  
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private String cep;
    private City cidade;

    public Person converter(ClientPersonRequestDTO clientPersonRequestDTO){
        Person person = new Person();
        BeanUtils.copyProperties(clientPersonRequestDTO, person);
        return person;
    }
}
