package com.example.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.data.ventaData;
import com.example.backend.services.ventaService;

@RestController
@RequestMapping(path = "/api/venta")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
public class ventaController {

    @Autowired
    private ventaService ventaService;

    // Metod registrar
    @PostMapping
    public ResponseEntity<?> insert(@RequestBody ventaData venta) {
        return new ResponseEntity<>(ventaService.insert(venta), HttpStatus.CREATED);
    }

    // metodo CONSULTAR
    @GetMapping
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<>(ventaService.findAll(), HttpStatus.OK);
    }

    // metodo CONSULTAR Id
    @GetMapping("{id]")
    public ResponseEntity<?> findById(@PathVariable int id) {
        return new ResponseEntity<>(ventaService.findById(id), HttpStatus.OK);
    }

    // metodo modificar
    @PutMapping
    public ResponseEntity<?> update(@RequestBody ventaData productos) {
        return new ResponseEntity<>(ventaService.update(productos), HttpStatus.OK);
    }

    // eliminar
    @DeleteMapping("{id]")
    public ResponseEntity<?> deleteById(@PathVariable int id) {
        return new ResponseEntity<>(ventaService.DeleteById(id), HttpStatus.OK);
    }
}
