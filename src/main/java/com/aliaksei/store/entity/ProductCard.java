package com.aliaksei.store.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_card")
public class ProductCard {

    @Id
    @Column(name = "card_id")
    private int cardId;

    @OneToMany(mappedBy = "productCard", targetEntity = Product.class)
    private List<Product> products;
}
