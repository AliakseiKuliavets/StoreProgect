package com.aliaksei.store.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberCard {
    private int cardId;
    private ClientDB clientDB;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberCard that = (MemberCard) o;
        return cardId == that.cardId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId);
    }

    @Override
    public String toString() {
        return "MemberCard{" +
                "cardId=" + cardId +
                ", clientDB=" + clientDB +
                '}';
    }
}
