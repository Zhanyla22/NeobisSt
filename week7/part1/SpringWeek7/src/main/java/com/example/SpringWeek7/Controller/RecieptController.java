package com.example.SpringWeek7.Controller;

import com.example.SpringWeek7.Entity.Reciept;
import com.example.SpringWeek7.Service.RecieptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reciept")
public class RecieptController {
    @Autowired
    private RecieptService recieptService;


    @GetMapping("/all-reciept")
    private List<Reciept> allReciepts(){
        return recieptService.getAllReciepts();
    }

    @GetMapping("/{id}")
    private Optional<Reciept> getByIdReciept(@PathVariable ("id") Integer id) throws Exception{
        return  recieptService.getByIdReciepts(id);
    }
}
