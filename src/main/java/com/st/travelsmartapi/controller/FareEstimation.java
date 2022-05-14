package com.st.travelsmartapi.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.st.travelsmartapi.dto.AvailableCourierCompanies;
import com.st.travelsmartapi.dto.NewOrderResponse;
import com.st.travelsmartapi.entity.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fare")
public class FareEstimation {



    @GetMapping("/getEstimatedFare")
    public Object getEstimatedFare(){
        return null;
    }


}


