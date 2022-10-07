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

import com.example.backend.data.productosData;
import com.example.backend.services.productoService;

@RestController
@RequestMapping(path = "/api/productos")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
public class productoControler {

    @Autowired
    private productoService productoService;

    // Metod registrar
    @PostMapping
    public ResponseEntity<?> insert(@RequestBody productosData productos) {
        return new ResponseEntity<>(productoService.insert(productos), HttpStatus.CREATED);
    }

    // metodo CONSULTAR

    @GetMapping
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<>(productoService.findAll(), HttpStatus.OK);
    }

    // metodo CONSULTAR Id

    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable int id) {
        return new ResponseEntity<>(productoService.findById(id), HttpStatus.OK);
    }

    // metodo modificar

    @PutMapping
    public ResponseEntity<?> update(@RequestBody productosData productos) {
        return new ResponseEntity<>(productoService.update(productos),
                HttpStatus.OK);
    }

    // eliminar

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id) {
        return new ResponseEntity<>(productoService.DeleteById(id), HttpStatus.OK);
    }

}
