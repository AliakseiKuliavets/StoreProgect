package com.aliaksei.store.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@AllArgsConstructor
@NoArgsConstructor
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
