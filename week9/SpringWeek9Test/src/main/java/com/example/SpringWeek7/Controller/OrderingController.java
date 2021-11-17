package com.example.SpringWeek7.Controller;

import com.example.SpringWeek7.Entity.Ordering;
import com.example.SpringWeek7.Service.OrderingService;
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
public class OrderingController {
    @Autowired
    private OrderingService orderService;

    @GetMapping("/all-Orders")
    public List<Ordering> allSales(){
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Optional<Ordering> OrdersById(@PathVariable("id") Integer id) throws Exception{
        return orderService.getByIdOrders(id);
    }
}
