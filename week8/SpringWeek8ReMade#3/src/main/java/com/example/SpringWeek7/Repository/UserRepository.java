package com.example.SpringWeek7.Repository;

import com.example.SpringWeek7.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<com.example.SpringWeek7.Entity.User,Integer> {

    User findUserByUsername(String username);
}
