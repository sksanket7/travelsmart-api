package com.st.travelsmartapi.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.st.travelsmartapi.dto.NewOrderResponse;
import com.st.travelsmartapi.entity.Order;
import com.st.travelsmartapi.entity.UserData;
import com.st.travelsmartapi.service.OrderService;
import com.st.travelsmartapi.service.UserService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;


@RestController
public class Home {

    @Autowired
    OrderService orderService;

    @Autowired
    UserService userService;
	/*
	  @Autowired
	  private BCryptPasswordEncoder bCryptPasswordEncoder;

	 String encodedPassword = bCryptPasswordEncoder.encode(userRegistrationObject.getPassword());
	 */



    @RequestMapping(value="/welcome",method=RequestMethod.GET)
    public String Welocme() {
        String text="You are not allow this page";
        text+="I am login page to welcome your home";
        return text;
    }
    @RequestMapping("/login")
    public String Welocme1() {
        String text="Welcome";
        text+="\n You are in Login Page";
        return text;
    }

    @GetMapping("/getOrdersJwt")
    public List<Order> getOrders(@PathParam("userId") String userId
    ) throws JsonProcessingException, JSONException {

        System.out.println("ORDER ID: "+userId);
        return orderService.getOrders(userId);

    }

    @PostMapping("/newOrder")
    public NewOrderResponse placeNewOrder(@RequestBody Order order) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        System.out.println( mapper.writeValueAsString(order));
        //mapper.writeValueAsString("Entire Json: "+ order);
        return orderService.placeNewOrder(order);
    }


    @GetMapping("/getEstimatedFare")
    public Object getEstimatedFare() {
            return null;
        }


    //get user details
    @GetMapping("/getUserDetails")
    public UserData userData(@PathParam("userId") String username){
        return userService.getUserDetails(username);
    }



}


