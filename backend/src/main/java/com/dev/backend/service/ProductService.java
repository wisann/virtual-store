package com.dev.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.entity.Product;
import com.dev.backend.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List <Product> buscarTodos(){
        return productRepository.findAll();
    }

    public Product inserir(Product product){
        product.setDataCriacao(new Date());
        Product newProduct = productRepository.saveAndFlush(product);
        return newProduct;
    }

    public Product alterar(Product product){
        product.setDataAtualizacao(new Date());
        return productRepository.saveAndFlush(product);
    }
    public void excluir(Long id){
        Product product = productRepository.findById(id).get();
        productRepository.delete(product);
    }

    
}
