package com.example.ShopSpringWeek7.controller;

import com.example.ShopSpringWeek7.entity.Order;
import com.example.ShopSpringWeek7.service.OrderService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/all Orders")
    public List<Order> allSales(){
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Optional<Order> OrdersById(@PathVariable("id") Integer id){
        return orderService.getByIdOrders(id);
    }
}
