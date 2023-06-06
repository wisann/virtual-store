package com.dev.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.entity.City;
import com.dev.backend.repository.CityRepository;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> buscarTodos(){
        return cityRepository.findAll();
    }

    public City inserir(City city){
        city.setDataCriacao(new Date());
        City newCity = cityRepository.saveAndFlush(city);
        return newCity;
    }

    public City alterar(City city){
        city.setDataAtualizacao(new Date());
        return cityRepository.saveAndFlush(city);
    }


    public void excluir(Long id){
        City city = cityRepository.findById(id).get();
        cityRepository.delete(city);
    }

    
}
