package com.dev.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.entity.State;
import com.dev.backend.repository.StateRepository;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;


    public List<State> buscarTodos(){
        return stateRepository.findAll();
    }
    public State inserir(State state){
        state.setDataCriacao(new Date());
        State newState = stateRepository.saveAndFlush(state);
        return newState;
    }

    public State alterar(State state){
        state.setDataAtualizacao(new Date());
        return stateRepository.saveAndFlush(state);

    }
                    
    public void excluir(Long id){
        
        State state  = stateRepository.findById(id).get();
        stateRepository.delete(state);

    }

    
    
}
