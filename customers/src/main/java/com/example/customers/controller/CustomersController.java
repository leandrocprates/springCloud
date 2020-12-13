package com.example.customers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustomersController {


    @GetMapping("/customers")
    public List<String> findAll() {
        return new ArrayList<String>( Arrays.asList( "Customer 1 " , "Customer 2 ","Customer 3 " )  );
    }



}
