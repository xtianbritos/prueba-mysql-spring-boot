package com.example.demo.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "telefono")
public class Telefono {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    private String id;


}
