package com.aliaksei.store.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.Objects;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDB {
    private int productId;
    private Date expiryDate;
    private double productCost;
    private int productDiscount;
    private int productQuantity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDB productDB = (ProductDB) o;
        return productId == productDB.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    @Override
    public String toString() {
        return "ProductDB{" +
                "productId=" + productId +
                ", expiryDate=" + expiryDate +
                ", productCost=" + productCost +
                ", productDiscount=" + productDiscount +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
