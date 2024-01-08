package com.aliaksei.store.controller.page;

import com.aliaksei.store.entity.Client;
import com.aliaksei.store.service.inter.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    @GetMapping("{id}")
    public Client getClientById(@PathVariable("id") String id) {
        return clientService.getClientById(id);
    }
}
