package com.example.products.controller;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductsController {

    @GetMapping("/products")
    public List<String> findAll() {
        return new ArrayList<String>( Arrays.asList( "Product 1 " , "Product 2 ","Product 3 " )  );
    }

}
