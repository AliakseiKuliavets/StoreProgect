package com.aliaksei.store.entity;

import jakarta.persistence.*;
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

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "hall_id")
    private Hall hall;

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
                ", product=" + product +
                ", client=" + client +
                ", hall=" + hall +
                '}';
    }
}
