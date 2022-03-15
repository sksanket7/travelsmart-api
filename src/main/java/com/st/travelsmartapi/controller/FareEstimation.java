package com.st.travelsmartapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fare")
public class FareEstimation {
    @GetMapping("/getEstimatedFare")
    public Object getEstimatedFare(){
        return null;
    }


}
