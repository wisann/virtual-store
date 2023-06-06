package com.dev.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backend.entity.ProductImages;

public interface ProductImagesRepository extends JpaRepository<ProductImages, Long>{
    
   
}