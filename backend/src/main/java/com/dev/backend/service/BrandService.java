package com.dev.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.entity.Brand;
import com.dev.backend.repository.BrandRepository;

@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public List<Brand> buscarTodos(){
        return brandRepository.findAll();
    }
    public Brand inserir(Brand brand){
        brand.setDataCriacao(new Date());
        Brand newBrand = brandRepository.saveAndFlush(brand);
        return newBrand;
    }

    public Brand alterar(Brand brand){
        brand.setDataAtualizacao(new Date());
        return brandRepository.saveAndFlush(brand);

    }

    public void excluir(Long id){
        
        Brand brand  = brandRepository.findById(id).get();
        brandRepository.delete(brand);

    }

    
}
