package com.example.n01561393_Assignment05_.Sale_management_System.service;

import com.example.n01561393_Assignment05_.Sale_management_System.entity.Sale;
import com.example.n01561393_Assignment05_.Sale_management_System.repository.SaleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    private final SaleRepository saleRepository;

    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public void addNewSale(Sale sale){
        saleRepository.save(sale);
    }

    public List<Sale> getAllSales(){
        return saleRepository.findAll();
    }
}
