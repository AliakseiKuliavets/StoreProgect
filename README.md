# Offline Store Management

This project is designed for efficient management of various aspects of an offline store similar to Lidl or Kaufland.
It is developed using Java and the Spring framework with a MySQL database.

## Project Description

The project aims to effectively manage all aspects of an offline store, including product inventory, interactions with
suppliers, warehouse stock tracking, cashier transactions, and loyalty programs for regular customers.

## Database Structure

### Product

- **Product ID (Java:`productId`)(mySQL:`product_id`):** Unique identifier for the product (UUID)(varchar(36)).
- **Product Name (Java:`productName`)(mySQL:`product_name`):** Name of the product (String)(VARCHAR(45)).
- **Weight of Product (Java:`weightProduct`)(mySQL:`product_weight`):** Weight of the product (double)(DECIMAL).
- **Cost of Product (Java:`productCost`)(mySQL:`product_cost`):** Cost of the product (double)(DECIMAL).
- **Discount on Product (Java:`productDiscount`)(mySQL:`product_discount`):** Discount on the product (int)(INT).
- **Expiry Date (Java:`expiryDate`)(mySQL:`product_expity_date`):** Expiry date of the product (Date)(DATE).
- **Delivery Number(Java:`deliveryNumber`)(mySQL:`product_delivery_number`):** Delivery number associated with the
  product (int)(INT).
- **Supplier ID (Java:`supplierId`)(mySQL:`supplier_id`):** Foreign key referencing `Supplier` table (UUID)(varchar(
  36)).
- **Warehouse ID (Java:`warehouseId`)(mySQL:`warehouse_id`):** Foreign key referencing `Warehouse` table (int)(INT).

### Warehouse

- **Warehouse ID (Java:`warehouseId`)(mySQL:`warehouse_id`):** Unique identifier for the product (UUID)(varchar(36)).
- **Products (Java:`productId`)(mySQL:`product_id`):** Foreign key referencing `Product` table (
  List<Product>)( ****** ).
- **Hall ID (Java:`hallId`)(mySQL:`hall_id`):** Foreign key referencing `Hall` table (int)(INT).

### Supplier

- **Supplier ID (Java:`supplierId`)(mySQL:`supplier_id`):** Unique identifier for the supplier (UUID)(varchar(36)).
- **Supplier Name (Java:`supplierName`)(mySQL:`supplier_name`):** Name of the supplier (VARCHAR(45)).
- **Warehouse ID (Java:`warehouseId`)(mySQL:`warehouse_id`):** Foreign key referencing `Warehouse` table (int)(INT).

### Hall

- **Hall ID (Java:`hallId`)(mySQL:`hall_id`):** Unique identifier for the hall (int)(INT).
- **Hall Name (Java:`hallName`)(mySQL:`hall_name`):** Name of the hall (String)(VARCHAR(45)).
- **Warehouse ID (Java:`warehouseId`)(mySQL:`warehouse_id`):** Foreign key referencing `Warehouse` table (UUID)(
  varchar(36)).
- **Cash Desk ID (Java:`cashDeskId`)(mySQL:`cash_desk_id`):** Foreign key referencing `CashDesk` table (int)(INT).

### Cash Desk

- **Cash Desk ID (Java:`cashDeskId`)(mySQL:`cash_desk_id`):** Unique identifier for the cashier (int)(INT).
- **Product ID (Java: `productId`)(mySQL:`product_id`):** Foreign key referencing `Product` table (UUID)(varchar(36)).
- **Client ID (Java: `clientId`)(mySQL:`client_id`):** Foreign key referencing `Client` table (int)(INT).
- **Hall ID (Java:`hallId`)(mySQL:`hall_id`):** Foreign key referencing `Hall` table (int)(INT).

### Client

- **Client ID (Java: `clientId`)(mySQL:`client_id`):** Unique identifier for the client (int)(INT).
- **Products (Java:`productId`)(mySQL:`product_id`):** Foreign key referencing `Product` table (
  List<Product>)( ****** ).
- **Member Card ID (Java: `memberCardId`)(mySQL:`member_card_id`):** Foreign key referencing `MemberCard` table (
  UUID)(varchar(36)).
- **Club Member Status (Java: `isClubMember`)(mySQL:`is_club_member`):** Boolean indicating if the client is a club
  member (boolean)(TINYINT).

### Member Card

- **Card ID (Java: `memberCardId`)(mySQL:`member_card_id`)  :** Unique identifier for the member card (UUID)(varchar(
  36)).
- **Client Database ID (Java: `clientDBId`)(mySQL:`client_db_id`)  :** Foreign key referencing `ClientDatabase` table (
  int)(INT).

### Client Database

- **Client DB ID (Java: `clientDBId`)(mySQL:`client_db_id`):** Unique identifier for the client DB (int)(INT).
- **First Name (Java: `firstName`)(mySQL:`client_first_name`):** First name of the client (String)(VARCHAR(45)).
- **Last Name (Java: `lastName`)(mySQL:`client_last_name`):** Last name of the client (String)(VARCHAR(45)).
- **Phone Number (Java: `phoneNumber`)(mySQL:`client_phone_number`):** Phone number of the client (String)(VARCHAR(45)).
- **Member Card ID (Java: `memberCardId`)(mySQL:`member_card_id`):** Foreign key referencing `MemberCard` table (UUID)(
  varchar(36)).
- **Product Discount(Java: `clientProductDiscount`)(mySQL:`client_product_discount`):** Discount offered to the client (
  int)(INT).

### Product Card

- **Card ID (Java: `cardId`)(mySQL:`card_id`):** Unique identifier for the product card (int)(INT).
  **Products (Java:`productId`)(mySQL:`product_id`):** Foreign key referencing `Product` table (
  List<Product>)( ****** ).

## Usage

1. Clone the repository to your local machine.
2. Ensure that Java, Spring, and MySQL are installed on your system.
3. Create a MySQL database and configure the connection in the `application.properties` file.
4. Run the application and start using the offline store management system.

## Note

This project is developed to enhance customer service and optimize resource management in an offline store.