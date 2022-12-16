package com.example.demo.repository;

import com.example.demo.entities.Telefono;
import org.springframework.data.repository.CrudRepository;

public interface TelefonoRepository extends CrudRepository<Telefono, Integer> {
}