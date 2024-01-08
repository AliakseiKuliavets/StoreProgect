package com.aliaksei.store.repository;

import com.aliaksei.store.entity.ClientDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDBRepository extends JpaRepository<ClientDB, Integer> {
}
