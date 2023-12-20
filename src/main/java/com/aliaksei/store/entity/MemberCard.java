package com.aliaksei.store.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Objects;
import java.util.UUID;

import static jakarta.persistence.CascadeType.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "member_card")
public class MemberCard {

    @Id
    @Column(name = "member_card_id")
    private UUID cardId;

    @Column(name = "client_db_id")
    @OneToOne(cascade = {MERGE,PERSIST,REFRESH})
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
