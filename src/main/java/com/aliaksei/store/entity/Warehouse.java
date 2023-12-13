package com.aliaksei.store.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Map;
import java.util.Objects;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Warehouse {
    private int warehouseId;
    private Map<Product, Integer> productCount;
    private ProductDB productDB;
    private Hall hall;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warehouse warehouse = (Warehouse) o;
        return warehouseId == warehouse.warehouseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(warehouseId);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "warehouseID=" + warehouseId +
                ", productCount=" + productCount +
                ", productDB=" + productDB +
                ", hall=" + hall +
                '}';
    }
}
