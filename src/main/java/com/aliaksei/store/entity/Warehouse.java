package com.aliaksei.store.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Objects;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Warehouse {
    private int warehouseID;
    private Map<Product, Integer> productCount;
    private ProductDB productDB;
    private Hall hall;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warehouse warehouse = (Warehouse) o;
        return warehouseID == warehouse.warehouseID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(warehouseID);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "warehouseID=" + warehouseID +
                ", productCount=" + productCount +
                ", productDB=" + productDB +
                ", hall=" + hall +
                '}';
    }
}
