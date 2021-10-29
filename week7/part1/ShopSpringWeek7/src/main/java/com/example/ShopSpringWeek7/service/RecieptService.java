package com.example.ShopSpringWeek7.service;

import com.example.ShopSpringWeek7.entity.Reciept;
import com.example.ShopSpringWeek7.repository.RecieptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecieptService {
    @Autowired
    private RecieptRepository recieptRepository;


    public List<Reciept> getAllReciepts(){
        return recieptRepository.findAll();
    }
    public Optional<Reciept> getByIdReciepts(Integer id){
        return recieptRepository.findById(id);
    }
}
