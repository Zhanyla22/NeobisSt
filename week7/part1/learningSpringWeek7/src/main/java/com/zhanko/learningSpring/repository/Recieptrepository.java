package com.zhanko.learningSpring.repository;

import com.zhanko.learningSpring.entity.RecieptEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Recieptrepository extends JpaRepository<RecieptEntity,Integer> {
}
