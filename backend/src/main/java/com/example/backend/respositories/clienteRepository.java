package com.example.backend.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.backend.entities.cliente;

@Repository
public interface clienteRepository extends JpaRepository<cliente, Integer> {

}
