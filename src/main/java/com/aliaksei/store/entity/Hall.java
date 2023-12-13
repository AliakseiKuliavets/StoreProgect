package com.aliaksei.store.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Hall {
    private int hallId;
    private Warehouse warehouse;
    private CashDesk cashDesk;
    private Product product;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hall hall = (Hall) o;
        return hallId == hall.hallId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hallId);
    }
}
