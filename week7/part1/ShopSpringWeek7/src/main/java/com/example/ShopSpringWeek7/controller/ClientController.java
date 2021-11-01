package com.example.ShopSpringWeek7.controller;

import com.example.ShopSpringWeek7.entity.Client;
import com.example.ShopSpringWeek7.service.ClientService;
import lombok.experimental.PackagePrivate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable("id") Integer id) {
        return clientService.getClientById(id);
    }

    @GetMapping("/allClient")
    public Iterable<Client> getAllClient() {
        return clientService.getAllCustomers();
    }

}
