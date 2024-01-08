package com.aliaksei.store.controller.page;

import com.aliaksei.store.entity.Product;
import com.aliaksei.store.service.inter.ProductService;
import com.aliaksei.store.validation.annotation.Uuid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("{id}")
    public Optional<Product> getProductById(@Uuid @PathVariable("id") String id) {
        return productService.getProductId(id);
    }
}
