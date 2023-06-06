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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dev.backend.entity.ProductImages;
import com.dev.backend.service.ProductImagesService;

@RestController
@RequestMapping("/api/productImages")
public class ProductImagesController {

    @Autowired
    private ProductImagesService productImagesService;

    @GetMapping("/")
    public List<ProductImages> buscarTodos(){
        return productImagesService.buscarTodos();
    }

    @PostMapping("/")
    public ProductImages inserir(@RequestParam("idProduto") Long idProduto, @RequestParam("file") MultipartFile file){
        return productImagesService.inserir(idProduto, file);
    }
    @PutMapping("/")
    public ProductImages alterar(@RequestBody ProductImages objeto){
        return productImagesService.alterar(objeto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        productImagesService.excluir(id);
        return ResponseEntity.ok().build();
    }
    
}
