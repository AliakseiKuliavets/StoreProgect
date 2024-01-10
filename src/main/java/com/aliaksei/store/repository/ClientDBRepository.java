package com.aliaksei.store.repository;

import com.aliaksei.store.entity.ClientDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDBRepository extends JpaRepository<ClientDB, Integer> {
}
