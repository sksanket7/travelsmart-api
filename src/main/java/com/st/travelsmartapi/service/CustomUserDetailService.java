package com.st.travelsmartapi.service;

import com.st.travelsmartapi.entity.UserData;
import com.st.travelsmartapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;




import java.util.ArrayList;

@Service
public class CustomUserDetailService  implements UserDetailsService {


    @Autowired(required = true)
    UserRepository repository;


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        UserData user=getUserDetails(userName);

        if(userName.equals(user.getUsername())) {

            return new User(user.getUsername(),user.getPassword(), new ArrayList<>());

        }else {
            throw new UsernameNotFoundException("User Name Not found..?");
        }

    }


    public UserData getUserDetails(String username) {

        java.util.Optional<UserData>  user=repository.findById(username);

        UserData u=null;
        if(user!=null) {

            u=user.get();
            System.out.println("Data base user and password");
            System.out.println(u.toString());

        }

        return u;
    }


}
