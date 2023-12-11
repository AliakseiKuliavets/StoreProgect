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
    private int PhoneNumber;
    private int cardID;
    private int productDiscount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientDB clientDB = (ClientDB) o;
        return PhoneNumber == clientDB.PhoneNumber && cardID == clientDB.cardID
                && productDiscount == clientDB.productDiscount
                && Objects.equals(firstName, clientDB.firstName)
                && Objects.equals(lastName, clientDB.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, PhoneNumber, cardID, productDiscount);
    }

    @Override
    public String toString() {
        return "ClientDB{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                ", cardID=" + cardID +
                ", productDiscount=" + productDiscount +
                '}';
    }
}
