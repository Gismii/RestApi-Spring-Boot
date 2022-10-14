package com.gismi_guimaraes.RestApi.controller;

import com.gismi_guimaraes.RestApi.model.Clientes;
import com.gismi_guimaraes.RestApi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController{

    @Autowired
    private ClienteRepository clienteRepository;
    @GetMapping
    public List<Clientes> listar() {

       return  clienteRepository.findAll();

    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Clientes adicionar (@RequestBody Clientes clientes){
         return  clienteRepository.save(clientes);
    }
}
