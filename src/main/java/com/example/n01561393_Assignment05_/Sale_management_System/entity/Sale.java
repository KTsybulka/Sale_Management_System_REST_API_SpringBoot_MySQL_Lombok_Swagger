package com.example.n01561393_Assignment05_.Sale_management_System.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//this annotation helps you show only the data you care about and hides technical details that aren't useful.
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

//    Hibernate to automatically set the current timestamp when the entity is created.
    @CreationTimestamp
    private LocalDateTime transactionDate;

    private String associateName;

//  Automatically apply all actions (like saving, updating, and deleting) to the related entity as well
    @OneToOne(cascade = CascadeType.ALL)
//    creates a foreign key column named storeId in the Sale table
    @JoinColumn(name = "storeId")
    private Store store;

}
