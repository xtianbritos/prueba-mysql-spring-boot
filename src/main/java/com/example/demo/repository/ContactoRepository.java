package com.example.demo.repository;

import com.example.demo.entities.Contacto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends CrudRepository<Contacto, Integer> {
}