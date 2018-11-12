package com.brm.training.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;

public class HelloWorldController {

    @GetMapping(path="/customer/{customer_id}/profile")
    public ResponseEntity<String> getCustomerProfile(){
        return null;
    }

    @PatchMapping(value="/customer/{customer_id/profile")
    public void ResponseEntity<String> updateProfile(){
        return null;
    }
}
