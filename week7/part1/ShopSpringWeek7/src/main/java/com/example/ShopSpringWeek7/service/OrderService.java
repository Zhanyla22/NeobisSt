package com.example.ShopSpringWeek7.service;

import com.example.ShopSpringWeek7.entity.Order;
import com.example.ShopSpringWeek7.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;


    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Optional<Order> getByIdOrders(Integer id){
        return orderRepository.findById(id);
    }

}
