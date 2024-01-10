package com.aliaksei.store.service.inter;

import com.aliaksei.store.entity.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    Product getProductId(String id);
    List<Product> findAllProduct();
}
