package com.example.ShopSpringWeek7.service;

import com.example.ShopSpringWeek7.entity.Client;
import com.example.ShopSpringWeek7.repository.ClientRepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client getClientById(Integer id){
        Optional<Client> client = clientRepository.findById(id);
        return client.get();

    }
    public Iterable<Client> getAllCustomers(){
        return clientRepository.findAll();
    }
}
