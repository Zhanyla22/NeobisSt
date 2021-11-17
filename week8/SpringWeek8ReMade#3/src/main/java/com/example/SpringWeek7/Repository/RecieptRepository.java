package com.example.SpringWeek7.Repository;

import com.example.SpringWeek7.Entity.Reciept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecieptRepository extends JpaRepository<Reciept,Integer> {
}
