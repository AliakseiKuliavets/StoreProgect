package com.aliaksei.store.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ClientDB {
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private int cardId;
    private int productDiscount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientDB clientDB = (ClientDB) o;
        return phoneNumber == clientDB.phoneNumber && cardId == clientDB.cardId
                && productDiscount == clientDB.productDiscount
                && Objects.equals(firstName, clientDB.firstName)
                && Objects.equals(lastName, clientDB.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, phoneNumber, cardId, productDiscount);
    }

    @Override
    public String toString() {
        return "ClientDB{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", PhoneNumber=" + phoneNumber +
                ", cardID=" + cardId +
                ", productDiscount=" + productDiscount +
                '}';
    }
}
