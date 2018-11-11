package com.brm.training.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class HelloWorldController {

    @GetMapping(path="/customer/{customer_id}/profile")
    public ResponseEntity<String> getCustomerProfile(){
        return null;
    }
}
