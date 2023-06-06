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

import com.dev.backend.entity.Permission;
import com.dev.backend.service.PermissionService;

@RestController
@RequestMapping("api/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @GetMapping("/")
    public List <Permission> buscarTodos(){
        return permissionService.buscarTodos();
    }

    @PostMapping("/")
    public Permission inserir(@RequestBody Permission permission){
        return permissionService.inserir(permission);

    }

    @PutMapping("/")
    public Permission alterar(@RequestBody Permission permission){
        return permissionService.alterar(permission);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Void> excluir (@PathVariable ("id") Long id){
        permissionService.excluir(id);
        return ResponseEntity.ok().build();
    }

    
}
