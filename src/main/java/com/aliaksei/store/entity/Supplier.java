package com.aliaksei.store.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


import java.util.Objects;
import java.util.UUID;

import static jakarta.persistence.CascadeType.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "supplier")
public class Supplier {

    @Id
    @Column(name = "supplier_id")
    private UUID supplierId;

    @OneToOne(mappedBy = "supplier")
    private Product product;

    @Column(name = "supplier_name")
    private String supplierName;

    @Column(name = "warehouse_id")
    @OneToOne(cascade = {MERGE,PERSIST,REFRESH})
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
                "supplierId=" + supplierId +
                ", product=" + product +
                ", supplierName='" + supplierName + '\'' +
                ", warehouse=" + warehouse +
                '}';
    }
}
