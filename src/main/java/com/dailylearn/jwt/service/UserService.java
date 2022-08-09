package com.dailylearn.jwt.service;

import com.dailylearn.jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        // Dummy user
        return new User("admin", "password", new ArrayList<>());

        // Add logic to fetch user from database
        //com.dailylearn.jwt.entity.User user = userRepository.findByEmail(email);
        //return new User(user.getEmail(), user.getPassword(), new ArrayList<>());

    }

}
