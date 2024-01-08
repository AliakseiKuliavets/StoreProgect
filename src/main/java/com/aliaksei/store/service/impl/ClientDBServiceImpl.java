package com.aliaksei.store.service.impl;

import com.aliaksei.store.entity.ClientDB;
import com.aliaksei.store.repository.ClientDBRepository;
import com.aliaksei.store.service.inter.ClientDBService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientDBServiceImpl implements ClientDBService {

    private final ClientDBRepository clientDBRepository;
    @Override
    public ClientDB getClientDBById(String id) {
        return clientDBRepository.findById(Integer.parseInt(id)).orElse(null);
    }
}
