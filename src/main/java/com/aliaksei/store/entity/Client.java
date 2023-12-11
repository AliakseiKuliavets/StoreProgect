package com.aliaksei.store.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Objects;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private int clientId;
    private Map<Product, Integer> productList;
    private MemberCard memberCard;
    private boolean isClubMember;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientId == client.clientId && isClubMember == client.isClubMember
                && Objects.equals(productList, client.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, productList, isClubMember);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID=" + clientId +
                ", productList=" + productList +
                ", memberCard=" + memberCard +
                ", isClubMember=" + isClubMember +
                '}';
    }
}
