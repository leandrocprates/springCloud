package com.example.customers;

import com.example.customers.controller.CustomersController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomersApplicationTests {

    @Autowired
    private CustomersController customersController ;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
        List<String>  atual =  customersController.findAll() ;
        List<String> expected = Arrays.asList( "Customer 1 " , "Customer 2 ","Customer 3 " );
        Assertions.assertEquals(expected,atual);
    }

    @Disabled
    @Test
    void somar(){
        System.out.println("Dentro metodo somar ");
    }

    @Test
    public void requisicao(){

        String baseUrl = "http://localhost:"+port+"/customers/";
        List<String>  listaCustomers= restTemplate.getForEntity(baseUrl,List.class).getBody();
        System.out.println("Volta Controller : ") ;
        listaCustomers.forEach(l -> System.out.println(l));
    }

}
