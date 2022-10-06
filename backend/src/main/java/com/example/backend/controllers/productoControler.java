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

import com.example.backend.data.productosData;
import com.example.backend.services.productoService;

@RestController
@RequestMapping(path = "/api/productos")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
public class productoControler {

    @Autowired
    private productoService clienteService;

    // Metod registrar
    @PostMapping
    public ResponseEntity<?> insert(@RequestBody productosData cliente) {
        return new ResponseEntity<>(clienteService.insert(cliente), HttpStatus.CREATED);
    }

}
