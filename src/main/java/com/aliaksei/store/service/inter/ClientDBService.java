package com.aliaksei.store.service.inter;

import com.aliaksei.store.entity.ClientDB;

public interface ClientDBService {
    ClientDB getClientById(String id);
}
