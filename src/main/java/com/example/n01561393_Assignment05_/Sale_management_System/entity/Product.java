package com.example.n01561393_Assignment05_.Sale_management_System.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String sku;
    private String description;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "transactionId")
    @JsonBackReference //handle circular references during JSON serialization and deserialization
    private Sale sale;
}
