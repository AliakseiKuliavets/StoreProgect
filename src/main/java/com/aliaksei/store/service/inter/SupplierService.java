package com.aliaksei.store.service.inter;

import com.aliaksei.store.entity.Supplier;

import java.util.List;

public interface SupplierService {
    Supplier getSupplierById(String id);
    List<Supplier> getAllSupplier();
}
