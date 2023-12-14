package com.aliaksei.store.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "product_id")
    private UUID productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_weight")
    private double weightProduct;

    @Column(name = "product_cost")
    private double productCost;

    @Column(name = "product_discount")
    private int productDiscount;

    @Column(name = "product_expity_date")
    private Date expityDate;

    @Column(name = "product_delivery_number")
    private int deliveryNumber;

    @Column(name = "supplier_id")
    private UUID supplierId;

    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;

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
                ", supplierId=" + supplierId +
                '}';
    }
}
