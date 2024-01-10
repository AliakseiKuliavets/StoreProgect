package com.aliaksei.store.controller.page;

import com.aliaksei.store.entity.Product;
import com.aliaksei.store.service.inter.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/{product_id}")
    public Product getProductById(@PathVariable("product_id") String  id) {
        System.out.println("Fetching product with ID: " + id);
        Product product = productService.getProductId(id);
        System.out.println("Fetched product: " + product);
        return product;
    }

    @GetMapping("/products")
    public List<Product> getAllProduct() {
        return productService.findAllProduct();
    }
}
