package com.example.n01561393_Assignment05_.Sale_management_System.repository;

import com.example.n01561393_Assignment05_.Sale_management_System.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
}
