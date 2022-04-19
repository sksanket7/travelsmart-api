package com.st.travelsmartapi.service;

import com.st.travelsmartapi.entity.UserData;
import com.st.travelsmartapi.repository.OrderRepository;
import com.st.travelsmartapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserData getUserDetails(String username) {

        return userRepository.findByUsername(username);

    }
}
