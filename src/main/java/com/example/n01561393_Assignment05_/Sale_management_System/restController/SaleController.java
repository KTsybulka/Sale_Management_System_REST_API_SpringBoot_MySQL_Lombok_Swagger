package com.example.n01561393_Assignment05_.Sale_management_System.restController;

import com.example.n01561393_Assignment05_.Sale_management_System.entity.Sale;
import com.example.n01561393_Assignment05_.Sale_management_System.service.SaleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SaleController {
    private final SaleService saleService;

    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @PostMapping("/sales")
    public ResponseEntity<String> addNewSale(@RequestBody Sale sale){
        saleService.addNewSale(sale);
        return new ResponseEntity<>("Sale added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/sales")
    public List<Sale> getAllSales(){
        return saleService.getAllSales();
    }
}
