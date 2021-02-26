package com.tts.ecomspring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO);
    private Long id;

//ints
    private int quantity;
    private double price;

//strings
    private String brand;
    private String category;
    private String name;
    private String image;
    private String description;
}
