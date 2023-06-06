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

import com.dev.backend.entity.Product;
import com.dev.backend.service.ProductService;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public List<Product> buscarTodos(){
        return productService.buscarTodos();
    }

    @PostMapping("/")
    public Product inserir(@RequestBody Product product){
        return productService.inserir(product);
    }

    @PutMapping
    public Product alterar(@RequestBody Product product){
        return productService.alterar(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable ("Id") Long id ){
        productService.excluir(id);
        return ResponseEntity.ok().build();
    }


    
}
