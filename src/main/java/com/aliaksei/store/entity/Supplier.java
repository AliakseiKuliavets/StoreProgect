package com.aliaksei.store.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Map;
import java.util.Objects;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
    private int supplierId;
    private String supplierName;
    private int deliveryNumber;
    private Map<Product, Integer> productCount;
    private Warehouse warehouse;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return supplierId == supplier.supplierId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierId);
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierID=" + supplierId +
                ", supplierName='" + supplierName + '\'' +
                ", deliveryNumber=" + deliveryNumber +
                ", productCount=" + productCount +
                ", warehouse=" + warehouse +
                '}';
    }
}
