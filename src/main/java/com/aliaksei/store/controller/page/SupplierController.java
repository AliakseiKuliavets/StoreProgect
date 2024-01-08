package com.aliaksei.store.controller.page;

import com.aliaksei.store.entity.Supplier;
import com.aliaksei.store.service.inter.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/supplier")
public class SupplierController {

    private final SupplierService supplierService;

    @GetMapping("/{supplier_id}")
    public Supplier getSupplierById(@PathVariable("supplier_id") String id) {
        return supplierService.getSupplierById(id);
    }
}
