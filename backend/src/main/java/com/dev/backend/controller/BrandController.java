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

import com.dev.backend.entity.Brand;
import com.dev.backend.service.BrandService;

@RestController
@RequestMapping("/api/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/")
    public List<Brand> buscarTodos(){
        return brandService.buscarTodos();

}

    @PostMapping("/")
    public Brand inserir(@RequestBody Brand brand){
        return brandService.inserir(brand);

    }
    @PutMapping("/")
    public Brand alterar(@RequestBody Brand brand){
        return brandService.alterar(brand);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> exluir(@PathVariable("id") Long id){
        brandService.excluir(id);
        return ResponseEntity.ok().build();

    }

    
}
