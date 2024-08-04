package com.example.product.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "product")
@Data
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
}
