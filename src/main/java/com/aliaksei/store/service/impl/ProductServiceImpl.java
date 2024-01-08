package com.aliaksei.store.service.impl;

import com.aliaksei.store.entity.Product;
import com.aliaksei.store.repository.ProductRepository;
import com.aliaksei.store.service.inter.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    @Override
    public Product getProductId(String id) {
        return productRepository.getReferenceById(UUID.fromString(id));
    }
}
