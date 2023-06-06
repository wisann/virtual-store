
package com.dev.backend.service;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dev.backend.entity.Product;
import com.dev.backend.entity.ProductImages;

import com.dev.backend.repository.ProductImagesRepository;
import com.dev.backend.repository.ProductRepository;




@Service
public class ProductImagesService {

    @Autowired
    private ProductImagesRepository productImagesRepository;

    @Autowired
    private ProductRepository productRepository;

    public List <ProductImages> buscarTodos(){
        return productImagesRepository.findAll();
    }

    public ProductImages inserir(Long idProduto, MultipartFile file){
        Product product = productRepository.findById(idProduto).get();
        ProductImages productImages = new ProductImages();
        try{
            if(!file.isEmpty()){
                byte[] bytes = file.getBytes();
                String nomeImagem = String.valueOf(product.getId() + file.getOriginalFilename());
                Path caminho = Paths.get("G:\\Meu Drive\\imagens-projeto", nomeImagem);
                Files.write(caminho, bytes);
                productImages.setName(nomeImagem);
                
            }
        } catch(IOException e){
            e.getStackTrace();
        }
        productImages.setProduct(product);
        productImages.setDataCriacao(new Date());
        productImages = productImagesRepository.saveAndFlush(productImages);
        return productImages;
    }

    public ProductImages alterar(ProductImages productImages){
        productImages.setDataAtualizacao(new Date());
        return productImagesRepository.saveAndFlush(productImages);
    }

    public void excluir(Long id){
        ProductImages productImages = productImagesRepository.findById(id).get();
        productImagesRepository.delete(productImages);
    }

   

}
