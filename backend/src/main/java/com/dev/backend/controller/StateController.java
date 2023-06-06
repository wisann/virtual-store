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

import com.dev.backend.entity.State;
import com.dev.backend.service.StateService;


@RestController
@RequestMapping("/api/state")
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping("/")
    public List<State> buscarTodos(){
        return stateService.buscarTodos();


}

    @PostMapping("/")
    public State inserir(@RequestBody State state){
        return stateService.inserir(state);

    }
    @PutMapping("/")
    public State alterar(@RequestBody State state){
        return stateService.alterar(state);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> exluir(@PathVariable("id") Long id){
        stateService.excluir(id);
        return ResponseEntity.ok().build();

    }
     
    
}
