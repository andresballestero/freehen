package com.example.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.backend.converters.productoConverter;
import com.example.backend.data.productosData;
import com.example.backend.entities.productos;
import com.example.backend.respositories.productosRepository;

@Service
public class productoService {
    @Autowired

    private productosRepository productosRepository;
    private productoConverter productoConverter = new productoConverter();

    // Servicio para registrar en la BD(en la cual se realiza la conversion de
    // adentro hacia afuera
    public productosData insert(productosData productos) {
        if (productosRepository.existsById(productos.getId()))
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Producto existente");
        return productoConverter.toData(productosRepository.save(productoConverter.toEntity(productos)));
    }

    // service for query all in the table
    public List<productosData> findAll() {
        return productoConverter.toData(productosRepository.findAll());
    }

    // query aplication by Id
    public productosData findById(int id) {
        Optional<productos> productos = productosRepository.findById(id);
        if (productos.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "producto no existe");
        return productoConverter.toData(productos.get());
    }

    // Update Aplication
    public productosData update(productosData cliente) {
        if (!productosRepository.existsById(cliente.getId()))
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Producto no existe");
        return productoConverter.toData(productosRepository.save(productoConverter.toEntity(cliente)));
    }

    // Delete aplication
    public productosData DeleteById(int id) {
        Optional<productos> cliente = productosRepository.findById(id);
        if (cliente.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Producto no existe");
        return productoConverter.toData(cliente.get());
    }

}
