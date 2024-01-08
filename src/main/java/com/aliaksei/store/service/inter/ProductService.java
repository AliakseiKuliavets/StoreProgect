package com.aliaksei.store.service.inter;

import com.aliaksei.store.entity.Product;

import java.util.Optional;

public interface ProductService {
    Optional<Product> getProductId(String id);
}
