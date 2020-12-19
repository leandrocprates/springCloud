package com.example.customers;

import com.example.customers.model.Aluno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomersApplication {

    public static void main(String[] args) {

        Aluno aluno  = new Aluno();
        aluno.setNumero(15);

        System.out.println(aluno.getNumero());


        SpringApplication.run(CustomersApplication.class, args);
    }

}
