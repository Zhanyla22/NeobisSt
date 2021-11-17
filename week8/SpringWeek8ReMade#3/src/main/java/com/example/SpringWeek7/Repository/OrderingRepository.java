package com.example.SpringWeek7.Repository;

import com.example.SpringWeek7.Entity.Ordering;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.criteria.Order;

@Repository
public interface OrderingRepository extends JpaRepository<Ordering,Integer> {
}
