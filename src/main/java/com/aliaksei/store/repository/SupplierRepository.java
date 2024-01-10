package com.aliaksei.store.repository;

import com.aliaksei.store.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, UUID> {
    Supplier getSuppliersBySupplierId(UUID uuid);

    @Query("select s from Supplier s")
    List<Supplier> getAllSupplier();
}
