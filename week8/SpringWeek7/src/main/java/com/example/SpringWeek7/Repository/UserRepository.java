package com.example.SpringWeek7.Repository;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository  extends JpaRepository<User,Integer> {

    User findUserByUsername(String username);
}
