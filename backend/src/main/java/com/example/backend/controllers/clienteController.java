package com.example.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.data.clienteData;
import com.example.backend.services.clienteService;

@RestController
@RequestMapping(path = "/api/cliente")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
public class clienteController {

    @Autowired
    private clienteService clienteService;

    // Metod registrar
    @PostMapping
    public ResponseEntity<?> insert(@RequestBody clienteData cliente) {
        return new ResponseEntity<>(clienteService.insert(cliente), HttpStatus.CREATED);
    }

}
