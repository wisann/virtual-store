package com.dev.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.entity.Permission;
import com.dev.backend.entity.Person;
import com.dev.backend.entity.PersonPermission;
import com.dev.backend.repository.PermissionRepository;
import com.dev.backend.repository.PersonPermissionRepository;

@Service
public class PersonPermissionService {

    @Autowired
    private PersonPermissionRepository personPermissionRepository;

    @Autowired
    private PermissionRepository permissionRepository;

    public void linkClientPersonPermission(Person person){
        List<Permission> listaPermissao = permissionRepository.findByNome("cliente");
        if(listaPermissao.size()>0){
            PersonPermission personPermission = new PersonPermission();
            personPermission.setPerson(person);
            personPermission.setPermission(listaPermissao.get(0));
            personPermission.setDataCriacao(new Date());
            personPermissionRepository.saveAndFlush(personPermission);
        }
    }
    
}
