package com.example.demo.repository;

import com.example.demo.entities.Contacto;
import org.springframework.data.repository.CrudRepository;

public interface ContactoRepository extends CrudRepository<Contacto, Integer> {
}