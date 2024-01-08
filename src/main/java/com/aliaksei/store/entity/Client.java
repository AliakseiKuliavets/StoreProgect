package com.aliaksei.store.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
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
@Table(name = "client")
public class Client {

    @Id
    @Column(name = "client_id")
    private int clientId;

    @Column(name = "is_club_member")
    private boolean isClubMember;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "member_card_id", referencedColumnName = "member_card_id")
    private MemberCard memberCard;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "card_id", referencedColumnName = "card_id")
    private ProductCard productCard;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(clientId, client.clientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId);
    }

    @Override
    public String toString() {
        return "Client{" +
                ", memberCard=" + memberCard +
                ", isClubMember=" + isClubMember +
                '}';
    }
}
