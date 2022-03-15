package com.st.travelsmartapi.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.st.travelsmartapi.dto.NewOrderResponse;
import com.st.travelsmartapi.entity.Order;
import com.st.travelsmartapi.service.OrderService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/newOrder")
    public NewOrderResponse placeNewOrder(@RequestBody Order order) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        System.out.println( mapper.writeValueAsString(order));
        //mapper.writeValueAsString("Entire Json: "+ order);
        return orderService.placeNewOrder(order);
    }

    @GetMapping("/getOrders")
    public List<Order> getOrders(@PathParam("userId") String userId
    ) throws JsonProcessingException, JSONException {

        System.out.println("ORDER ID: "+userId);
        return orderService.getOrders(userId);

    }
}
