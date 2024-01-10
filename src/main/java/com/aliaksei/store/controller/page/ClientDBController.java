package com.aliaksei.store.controller.page;

import com.aliaksei.store.entity.ClientDB;
import com.aliaksei.store.service.inter.ClientDBService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clientdb")
public class ClientDBController {

    private final ClientDBService clientDBService;

    // работает
    @GetMapping("/{id}")
    public ClientDB getClientDBById(@PathVariable("id") String id) {
        return clientDBService.getClientDBById(id);
    }
}
