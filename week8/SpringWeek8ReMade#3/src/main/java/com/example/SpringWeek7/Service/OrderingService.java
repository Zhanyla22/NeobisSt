package com.example.SpringWeek7.Service;
import com.example.SpringWeek7.Entity.Ordering;
import com.example.SpringWeek7.Entity.Reciept;
import com.example.SpringWeek7.Repository.OrderingRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderingService {
    @Autowired
    private OrderingRepository orderingRepository;


    public List<Ordering> getAllOrders(){
        return orderingRepository.findAll();
    }
    public Optional<Ordering> getByIdOrders (Integer id) throws Exception{
        return Optional.ofNullable(orderingRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("There is no such an Order with this id :", id))));
    }
}
