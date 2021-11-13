package com.example.SpringWeek7.Service;

import com.example.SpringWeek7.Entity.Reciept;
import com.example.SpringWeek7.Repository.RecieptRepository;
import javassist.NotFoundException;
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
    public Optional<Reciept> getByIdReciepts(Integer id) throws Exception{
        return Optional.ofNullable(recieptRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("!!!! there is no such a reciept with this id :",id))));
    }
}
