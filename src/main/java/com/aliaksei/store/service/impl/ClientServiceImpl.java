package com.aliaksei.store.service.impl;

import com.aliaksei.store.entity.Client;
import com.aliaksei.store.repository.ClientRepository;
import com.aliaksei.store.service.inter.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client getClientById(String id) {
        return clientRepository.getReferenceById(Integer.parseInt(id));
    }
}
