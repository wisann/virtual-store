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

import com.dev.backend.entity.City;
import com.dev.backend.service.CityService;


@RestController
@RequestMapping("/api/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/")
    public List<City> buscarTodos(){
        return cityService.buscarTodos();
    }

    @PostMapping("/")
    public City inserir( @RequestBody City city){
        return cityService.inserir(city);
    }

    @PutMapping("/")
    public City alterar( @RequestBody City city){
        return cityService.alterar(city);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Void> excluir(@PathVariable("id") Long id){
        cityService.excluir(id);
        return ResponseEntity.ok().build();
    }
    
}
