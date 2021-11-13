package com.example.SpringWeek7.Service;

import com.example.SpringWeek7.Entity.User;
import com.example.SpringWeek7.Entity.UserInfoDetails;
import com.example.SpringWeek7.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        org.apache.catalina.User user = userRepository.findUserByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("There is no such an user!!! no! no! no!");
        }
        return new UserInfoDetails((User) user);
    }
}
