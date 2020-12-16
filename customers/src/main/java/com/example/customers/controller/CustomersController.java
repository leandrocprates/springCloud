package com.example.customers.controller;

import com.example.customers.model.ModelTeste;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustomersController {


    @GetMapping("/customers")
    public List<String> findAll() {
        return new ArrayList<String>( Arrays.asList( "Customer 1 " , "Customer 2 ","Customer 3 " )  );
    }

    @RequestMapping(value="/{id}",method= RequestMethod.DELETE)
    public ResponseEntity<Object> deleleById(@PathVariable Long id , @RequestBody ModelTeste body){
        System.out.println("Deletando id:  " + id );
        System.out.println("Deletando body:  "  + body.getMessage() + " : "+body.getId()  );
        return new ResponseEntity<>(null, HttpStatus.OK );
    }

    @GetMapping("/customers/body")
    public List<String> findAllwithBody(@RequestBody ModelTeste body) {
        System.out.println("Find body:  " + body.getMessage() + " : "+body.getId() );
        return new ArrayList<String>( Arrays.asList( "Customer 1 " , "Customer 2 ","Customer 3 " )  );
    }


}
