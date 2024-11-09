package com.example.n01561393_Assignment05_.Sale_management_System;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication


//OpenAPI provides a clear way to describe the API, making it easier to use,
// and the dependency helps automatically generate that description for the
// Java Spring applications. This makes the API more user-friendly for other developers!
@OpenAPIDefinition(
		info = @Info(
				title = "Sale Management System API",
				version = "1.0",
				description = "API for managing sales transactions, stores, and products, including endpoints to add, retrieve, and manage sales data, store information, and product details."
		)
)

public class N01561393Assignment05SaleManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(N01561393Assignment05SaleManagementSystemApplication.class, args);
	}

}
