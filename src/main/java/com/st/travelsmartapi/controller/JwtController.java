package com.st.travelsmartapi.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.st.travelsmartapi.helper.JwtUtil;
import com.st.travelsmartapi.dto.JwtRequest;
import com.st.travelsmartapi.dto.JwtResponse;
import com.st.travelsmartapi.service.CustomUserDetailService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@ResponseBody
public class JwtController {


    @org.springframework.beans.factory.annotation.Autowired(required=true)
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailService customuserdetailsservice;

    @Autowired
    private JwtUtil jwtutil;

    @RequestMapping(value="/token",method =RequestMethod.POST)
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest ) throws Exception{

        System.out.println("Hello Controller");
        System.out.println(jwtRequest.toString());
        try {
            System.out.println("Hi");
            this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(),jwtRequest.getPassword()));
            System.out.println("Hi");
        }
        catch(UsernameNotFoundException user) {
            user.printStackTrace();
            throw new Exception("Username not found: "+user);
        }
        catch(BadCredentialsException e) {
            e.printStackTrace();
            throw new Exception("Bad Credential Exception: "+e);
        }

        //fine are go a head
        UserDetails userDetails	=this.customuserdetailsservice.loadUserByUsername(jwtRequest.getUsername());
        System.out.println("Hello token generater-1");
        String token=this.jwtutil.generateToken(userDetails);
        System.out.println("Hello token generater-2");
        System.out.println(token);

        return ResponseEntity.ok(new JwtResponse(token));
    }
}
