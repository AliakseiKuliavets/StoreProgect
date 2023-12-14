package com.aliaksei.store.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Objects;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hall")
public class Hall {

    @Id
    @Column(name = "hall_id")
    private int hallId;

    @Column(name = "hall_name")
    private String hallName;

    @Column(name = "warehouse_id")
    private int warehouseId;

    @Column(name = "cash_desk_id")
    private int cashDeskId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hall hall = (Hall) o;
        return Objects.equals(hallId, hall.hallId) && Objects.equals(hallName, hall.hallName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hallId, hallName);
    }

    @Override
    public String toString() {
        return "Hall{" +
                "hallId=" + hallId +
                ", hallName='" + hallName + '\'' +
                '}';
    }
}
