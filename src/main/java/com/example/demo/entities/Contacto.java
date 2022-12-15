package com.example.demo.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "contacto")
public class Contacto {
    @Id
    @Column(name = "id", nullable = false)
    private String id;



}