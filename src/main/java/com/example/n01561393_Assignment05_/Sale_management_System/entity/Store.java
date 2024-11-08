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
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;
    private String street;
    private String city;
    private String province;
    private String country;

    @OneToOne(mappedBy = "store") //name of Store object in Sale class
//   Stop endless back-and-forth references when converting objects to JSON
    @JsonBackReference
    private Sale sale;

}
