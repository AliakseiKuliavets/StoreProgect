package com.aliaksei.store.service.impl;

import com.aliaksei.store.entity.Product;
import com.aliaksei.store.repository.ProductRepository;
import com.aliaksei.store.service.inter.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    @Override
    public Product getProductId(String id) {
        return productRepository.findById(UUID.fromString(id)).orElse(null);
    }
    @Override
    public List<Product> findAllProduct() {
        return productRepository.getAllProducts();
    }
}
