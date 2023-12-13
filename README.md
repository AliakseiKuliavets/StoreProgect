# Offline Store Management

This project is designed for efficient management of various aspects of an offline store similar to Lidl or Kaufland.
It is developed using Java and the Spring framework with a MySQL database.

## Project Description

The project aims to effectively manage all aspects of an offline store, including product inventory, interactions with 
suppliers, warehouse stock tracking, cashier transactions, and loyalty programs for regular customers.

## Database Structure

### Product
- **Product ID (`productID`):** Unique identifier for the product (INT).
- **Product Name (`productName`):** Name of the product (VARCHAR(255)).
- **Weight of Product (`weightProduct`):** Weight of the product (DOUBLE).
- **Cost of Product (`productCost`):** Cost of the product (DOUBLE).
- **Discount on Product (`productDiscount`):** Discount on the product (INT).
- **Expiry Date (`expiryDate`):** Expiry date of the product (DATE).
- **Delivery Number (`deliveryNumber`):** Delivery number associated with the product (INT).
- **Supplier ID (`supplierID`):** Foreign key referencing `Supplier` table (INT).
- **Product Type (`productType`):** Type of the product (VARCHAR(255)).

### Warehouse
- **Warehouse ID (`warehouseID`):** Unique identifier for the warehouse (INT).
- **Product Database ID (`productDB`):** Foreign key referencing `ProductDatabase` table (INT).
- **Hall ID (`hallID`):** Foreign key referencing `Hall` table (INT).

### Supplier
- **Supplier ID (`supplierID`):** Unique identifier for the supplier (INT).
- **Supplier Name (`supplierName`):** Name of the supplier (VARCHAR(255)).
- **Delivery Number (`deliveryNumber`):** Delivery number (INT).
- **Warehouse ID (`warehouseID`):** Foreign key referencing `Warehouse` table (INT).

### Hall
- **Hall ID (`hallID`):** Unique identifier for the hall (INT).
- **Warehouse ID (`warehouseID`):** Foreign key referencing `Warehouse` table (INT).
- **Cash Desk ID (`cashDeskID`):** Foreign key referencing `CashDesk` table (INT).
- **Product ID (`productID`):** Foreign key referencing `Product` table (INT).

### Cash Desk
- **Cashier ID (`cashierID`):** Unique identifier for the cashier (INT).
- **Product ID (`productID`):** Foreign key referencing `Product` table (INT).
- **Client ID (`clientID`):** Foreign key referencing `Client` table (INT).
- **Hall ID (`hallID`):** Foreign key referencing `Hall` table (INT).
- **Product Database ID (`productDB`):** Foreign key referencing `ProductDatabase` table (INT).

### Client
- **Client ID (`clientID`):** Unique identifier for the client (INT).
- **Club Member Status (`isClubMember`):** Boolean indicating if the client is a club member (BOOLEAN).
- **Member Card ID (`memberCardID`):** Foreign key referencing `MemberCard` table (INT).

### Member Card
- **Card ID (`cardID`):** Unique identifier for the member card (INT).
- **Client Database ID (`clientDB`):** Foreign key referencing `ClientDatabase` table (INT).

### Client Database
- **Client ID (`clientID`):** Unique identifier for the client in the database (INT).
- **First Name (`firstName`):** First name of the client (VARCHAR(255)).
- **Last Name (`lastName`):** Last name of the client (VARCHAR(255)).
- **Phone Number (`phoneNumber`):** Phone number of the client (LONG).
- **Card ID (`cardID`):** Foreign key referencing `MemberCard` table (INT).
- **Product Discount (`productDiscount`):** Discount offered to the client (INT).

### Product Database
- **Product Database ID (`productDbId`):** Unique identifier for the product database (INT).

### Product Count
- **Product Database ID (`productDbId`):** Foreign key referencing `ProductDatabase` table (INT).
- **Product ID (`productId`):** Foreign key referencing `Product` table (INT).
- **Count (`count`):** The count of the product (INT).

## Usage

1. Clone the repository to your local machine.
2. Ensure that Java, Spring, and MySQL are installed on your system.
3. Create a MySQL database and configure the connection in the `application.properties` file.
4. Run the application and start using the offline store management system.

## Note

This project is developed to enhance customer service and optimize resource management in an offline store.

