package com.example.SpringWeek7.Service;

import com.example.SpringWeek7.Entity.Client;
import com.example.SpringWeek7.Entity.Employee;
import com.example.SpringWeek7.Repository.ClientRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

   // public Optional<Employee> findByIdEmployee(Integer id) throws Exception{
      //  return Optional.ofNullable(employeeRepository.findById(id)
          //      .orElseThrow(() -> new NotFoundException(String.format("There is no such an Employee with this id :", id))));

    public Optional<Client> getClientById(Integer id) throws Exception{
       return Optional.ofNullable(clientRepository.findById(id))
               .orElseThrow(() -> new NotFoundException(String.format("There is no Client with this id",id)));


    }
    public Iterable<Client> getAllCustomers(){
        return clientRepository.findAll();
    }
}
