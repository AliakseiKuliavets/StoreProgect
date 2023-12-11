package com.aliaksei.store.entity;

import com.aliaksei.store.enums.ProductType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Objects;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private int productId;
    private String productName;
    private double weightProduct;
    private double productCost;
    private int productDiscount;
    private Date expityDate;
    private int deliveryNumber;
    private Supplier supplier;
    private ProductType productType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", weightProduct=" + weightProduct +
                ", productCost=" + productCost +
                ", productDiscount=" + productDiscount +
                ", expityDate=" + expityDate +
                ", deliveryNumber=" + deliveryNumber +
                ", supplier=" + supplier +
                ", productType=" + productType +
                '}';
    }
}
