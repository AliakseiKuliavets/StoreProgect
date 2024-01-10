package com.aliaksei.store.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
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

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "member_card_id", referencedColumnName = "member_card_id")
    private MemberCard memberCard;

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
                ", memberCardId=" + memberCard +
                ", clientProductDiscount=" + clientProductDiscount +
                '}';
    }
}
