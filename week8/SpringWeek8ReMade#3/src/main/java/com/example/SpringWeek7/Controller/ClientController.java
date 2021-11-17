package com.example.SpringWeek7.Controller;

import com.example.SpringWeek7.Entity.Client;
import com.example.SpringWeek7.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/{id}")
    public Optional<Client> getClientById(@PathVariable("id") Integer id) throws Exception {
        return clientService.getClientById(id);
    }

    @GetMapping("/all-Client")
    public Iterable<Client> getAllClient() {
        return clientService.getAllCustomers();
    }

}
