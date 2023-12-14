package com.aliaksei.store.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Objects;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cash_desk")
public class CashDesk {

    @Id
    @Column(name = "cash_desk_id")
    private UUID cashDeskId;

    @Column(name = "product_id")
    private UUID productId;

    @Column(name = "client_id")
    private UUID clientId;

    @Column(name = "hall_id")
    private UUID hallId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CashDesk cashDesk = (CashDesk) o;
        return Objects.equals(cashDeskId, cashDesk.cashDeskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cashDeskId);
    }

    @Override
    public String toString() {
        return "CashDesk{" +
                "cashierId=" + cashDeskId +
                ", productId=" + productId +
                ", clientId=" + clientId +
                ", hallId=" + hallId +
                '}';
    }
}
