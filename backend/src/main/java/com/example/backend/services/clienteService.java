package com.example.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.backend.converters.clienteConverter;
import com.example.backend.data.clienteData;
import com.example.backend.entities.cliente;
import com.example.backend.respositories.clienteRepository;

@Service
public class clienteService {
    @Autowired
    private clienteRepository clienteRepository;
    private clienteConverter clienteConverter = new clienteConverter();

    // Servicio para registrar en la BD(en la cual se realiza la conversion de
    // adentro hacia afuera
    public clienteData insert(clienteData cliente) {
        if (clienteRepository.existsById(cliente.getId()))
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Cliente existente");
        return clienteConverter.toData(clienteRepository.save(clienteConverter.toEntity(cliente)));
    }

    // service for query all in the table
    public List<clienteData> findAll() {
        return clienteConverter.toData(clienteRepository.findAll());
    }

    // query aplication by Id
    public clienteData findById(int id) {
        Optional<cliente> cliente = clienteRepository.findById(id);
        if (cliente.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente no existe");
        return clienteConverter.toData(cliente.get());
    }

    // Update Aplication
    public clienteData update(clienteData cliente) {
        if (!clienteRepository.existsById(cliente.getId()))
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente no existe");
        return clienteConverter.toData(clienteRepository.save(clienteConverter.toEntity(cliente)));
    }

    // Delete aplication
    public clienteData deleteById(int id) {
        Optional<cliente> cliente = clienteRepository.findById(id);
        if (cliente.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente no existe");
        clienteRepository.deleteById(id);
        return clienteConverter.toData(cliente.get());
    }
}
