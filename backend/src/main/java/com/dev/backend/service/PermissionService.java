package com.dev.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.entity.Permission;
import com.dev.backend.repository.PermissionRepository;

@Service
public class PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    public List <Permission> buscarTodos(){
        return permissionRepository.findAll();
    }

    public Permission inserir(Permission permission){
        permission.setDataCriacao(new Date());
        Permission newPermission = permissionRepository.saveAndFlush(permission);
        return newPermission;

    }

    public Permission alterar(Permission permission){
        permission.setDataAtualizacao(new Date());
        return permissionRepository.saveAndFlush(permission);
    }

    public void excluir(long id){
        Permission permission = permissionRepository.findById(id).get();
        permissionRepository.delete(permission);
    }

}
