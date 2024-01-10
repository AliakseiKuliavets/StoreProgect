package com.aliaksei.store.service.impl;

import com.aliaksei.store.entity.Supplier;
import com.aliaksei.store.repository.SupplierRepository;
import com.aliaksei.store.service.inter.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository supplierRepository;

    @Override
    public Supplier getSupplierById(String id) {
        return supplierRepository.getSuppliersBySupplierId(UUID.fromString(id));
    }

    @Override
    public List<Supplier> getAllSupplier(){
        return supplierRepository.getAllSupplier();
    }
}
