# Offline Store Management

This project is designed for efficient management of various aspects of an offline store similar to Lidl or Kaufland. It is developed using Java and the Spring framework with a MySQL database.

## Project Description

The project aims to effectively manage all aspects of an offline store, including product inventory, interactions with suppliers, warehouse stock tracking, cashier transactions, and loyalty programs for regular customers.

## Database Structure

### Product

- **Product ID (productid):** Unique identifier for the product (int)
- **Product Name (productName):** Name of the product (String)
- **Weight of the Product (weightProduct):** Weight of the product (double)
- **Product Cost (productCost):** Cost of the product (double)
- **Product Discount (productDiscount):** Discount on the product (int)
- **Expiry Date (expiryDate):** Expiry date of the product (Date)
- **Delivery Number (deliveryNumber):** Delivery number of the product (int)
- **Supplier (supplier):** Foreign key reference to the Supplier entity (Supplier)
- **Product Type (productType):** Type of the product (ProductType)

### Warehouse

- **Warehouse ID (warehouseId):** Unique identifier for the warehouse (int)
- **Product Count (productCount):** Map of products with their quantities (Map<Product,Integer>)
- **Link to Product Database (productDB):** Foreign key reference to the Product Database entity (ProductDB)
- **Link to Hall (hall):** Foreign key reference to the Hall entity (Hall)

### Supplier

- **Supplier ID (supplierId):** Unique identifier for the supplier (int)
- **Supplier Name (supplierName):** Name of the supplier (String)
- **Delivery Number (deliveryNumber):** Delivery number (int)
- **Product Count (productCount):** Map of products with their quantities (Map<Product, Integer>)
- **Link to Warehouse (warehouse):** Foreign key reference to the Warehouse entity (Warehouse)

### Hall

- **Hall ID (hallId):** Unique identifier for the hall (int)
- **Link to Warehouse (warehouse):** Foreign key reference to the Warehouse entity (Warehouse)
- **Link to Cash Desk (cashDesk):** Foreign key reference to the Cash Desk entity (CashDesk)
- **Link to Product (product):** Foreign key reference to the Product entity (Product)

### Cash Desk

- **Cashier ID (cashierId):** Unique identifier for the cash desk (int)
- **Link to Product (product):** Foreign key reference to the Product entity (Product)
- **Link to Client (client):** Foreign key reference to the Client entity (Client)
- **Link to Hall (hall):** Foreign key reference to the Hall entity (Hall)
- **Link to Product Database (productDB):** Foreign key reference to the Product Database entity (Product)

### Client

- **Client ID (clientId):** Unique identifier for the client (int)
- **Product List (productList):** Map of products with their quantities (Map<Product, Integer>)
- **Club Membership Status (isClubMember):** Whether the client is a club member (boolean)
- **Member Card ID (memberCard):** Foreign key reference to the Member Card entity (MemberCard)

### Member Card

- **Card ID (cardId):** Unique identifier for the member card (int)
- **Link to Client Database (clientDB):** Foreign key reference to the Client Database entity (ClientDB)

### Client Database

- **First Name (firstName):** Client's first name (String)
- **Last Name (lastName):** Client's last name (String)
- **Phone Number (phoneNumber):** Client's phone number (int)
- **Card ID (cardId):** Client's card number (int)
- **Product Discount (productDiscount):** Discount on products for the client (int)

### Product Database

- **Product ID (productid):** Unique identifier for the product (int)
- **Expiry Date of the Product (expiryDate):** Expiry date of the product (Date)
- **Cost of the Product (productCost):** Cost of the product (double)
- **Discount on the Product (productDiscount):** Discount on the product (int)
- **Quantity of the Product (productQuantity):** Quantity of the product (int)

## Usage

1. Clone the repository to your local machine.
2. Ensure that Java, Spring, and MySQL are installed on your system.
3. Create a MySQL database and configure the connection in the `application.properties` file.
4. Run the application and start using the offline store management system.

## Note

This project is developed to enhance customer service and optimize resource management in an offline store.
