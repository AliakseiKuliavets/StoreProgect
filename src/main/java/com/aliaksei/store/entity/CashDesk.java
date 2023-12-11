package com.aliaksei.store.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CashDesk {
    private int cashierId;
    private Product product;
    private Client client;
    private Hall hall;
    private Product productDB;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CashDesk cashDesk = (CashDesk) o;
        return cashierId == cashDesk.cashierId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cashierId);
    }

    @Override
    public String toString() {
        return "CashDesk{" +
                "cashierId=" + cashierId +
                ", product=" + product +
                ", client=" + client +
                ", hall=" + hall +
                ", productDatabase=" + productDB +
                '}';
    }
}
