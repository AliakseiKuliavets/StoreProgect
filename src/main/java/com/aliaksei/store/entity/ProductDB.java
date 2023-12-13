package com.aliaksei.store.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDB {
    private int productDbId;
    private Map<Integer, List<Product>> sortProductDeliveryNumber;
    private Map<Product, Integer> productCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDB productDB = (ProductDB) o;
        return productDbId == productDB.productDbId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productDbId);
    }

    @Override
    public String toString() {
        return "ProductDB{" +
                "productDbId=" + productDbId +
                ", integerListMap=" + sortProductDeliveryNumber +
                ", productCount=" + productCount +
                '}';
    }
}
