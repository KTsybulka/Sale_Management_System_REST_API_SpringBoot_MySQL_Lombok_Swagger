# Sale_Management_System_RESTAPI_SpringBoot_MySQL_Lombok_Swagger

This project is a **Sale Management System** built as a **REST API** using **Spring Boot** with **MySQL** as the database, **Lombok** to reduce boilerplate code, and **Swagger** for API documentation. The system allows users to manage sales transactions, store information, and products through a RESTful interface.

## Features:
- **Sales Management**: Manage sales transactions with attributes like TransactionID, Date, and Associate Name.
- **Store Management**: Manage store details such as StoreId, Street, City, Province, and Country.
- **Product Management**: Manage product details including Product ID, SKU, Description, and Price.
- **Entity Constraints**:
  - One Sale can only be associated with a single Store.
  - A Sale can have multiple Products.
  - Multiple Products can belong to a Sale.
- **MySQL Database**: The system uses MySQL as the database to store sales, stores, and product data.
- **Lombok**: Simplifies code by reducing the need for getters, setters, constructors, etc.
- **Swagger Integration**: Provides an interactive UI for exploring and testing the API endpoints.
- **Spring Boot**: The backend is implemented using Spring Boot, ensuring a fast, scalable, and easy-to-manage RESTful API.

## Operations:

### Sale Operations:
- **Add a Sale** with a Store and a Product.
- **Add a Sale** with a Store and multiple Products.
- **Fetch all Sales**, including associated Store and Products.
- **Fetch a Store** for a given Sale TransactionID.
- **Fetch Products** for a given Sale TransactionID.

### API Endpoints:
The project exposes several RESTful endpoints, which can be explored and tested through **Swagger UI**.

## Project Setup:

### Prerequisites:
- Java 11 or higher
- Spring Boot 2.x or higher
- MySQL 8.x or higher

### Steps to Set Up:
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/Sale_Management_System_RESTAPI_SpringBoot_MySQL_Lombok_Swagger.git
