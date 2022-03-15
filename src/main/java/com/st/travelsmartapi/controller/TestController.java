package com.st.travelsmartapi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/travelsmart")
public class TestController {

    @GetMapping("/test")
    public String testAPI(){

       return "testOK";

    }

}
