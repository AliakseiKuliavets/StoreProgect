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
@Table(name = "client_db")
public class ClientDB {

    @Id
    @Column(name = "client_db_id")
    private int clientDBId;

    @Column(name = "client_first_name")
    private String firstName;

    @Column(name = "client_last_name")
    private String lastName;

    @Column(name = "client_phone_number")
    private String phoneNumber;

    @Column(name = "member_card_id")
    private UUID memberCardId;

    @Column(name = "client_product_discount")
    private int clientProductDiscount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientDB clientDB = (ClientDB) o;
        return Objects.equals(clientDBId, clientDB.clientDBId) && Objects.equals(phoneNumber, clientDB.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientDBId, phoneNumber);
    }

    @Override
    public String toString() {
        return "ClientDB{" +
                "clientDBId=" + clientDBId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
//                ", memberCardId=" + memberCardId +
                ", clientProductDiscount=" + clientProductDiscount +
                '}';
    }
}
