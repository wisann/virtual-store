package com.dev.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.entity.Category;
import com.dev.backend.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    public List<Category> buscarTodos(){
        return categoryRepository.findAll();
    }
    public Category inserir(Category category){
        category.setDataCriacao(new Date());
        Category newCategory = categoryRepository.saveAndFlush(category);
        return newCategory;
    }

    public Category alterar(Category category){
        category.setDataAtualizacao(new Date());
        return categoryRepository.saveAndFlush(category);

    }

    public void excluir(Long id){
        
        Category state  = categoryRepository.findById(id).get();
        categoryRepository.delete(state);

    }
    
}
