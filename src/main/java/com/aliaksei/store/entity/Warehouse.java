package com.aliaksei.store.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "warehouse")
public class Warehouse {

    @Id
    @Column(name = "warehouse_id")
    private int warehouseId;

    @OneToMany(mappedBy = "warehouse")
    private List<Product> products;

    @OneToOne(mappedBy = "warehouse")
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
                "warehouseId=" + warehouseId +
                ", products=" + products +
                ", hall=" + hall +
                '}';
    }
}
