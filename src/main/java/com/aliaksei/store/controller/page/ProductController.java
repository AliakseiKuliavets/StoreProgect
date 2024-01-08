package com.aliaksei.store.controller.page;

import com.aliaksei.store.entity.Product;
import com.aliaksei.store.service.inter.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/{product_id}")
    public Product getProductById(@PathVariable("product_id") String id) {
        return productService.getProductId(id);
    }
}
