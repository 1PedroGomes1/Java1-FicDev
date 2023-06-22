package com.mycompany.capitulo16maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
@SpringBootApplication
public class OlaResource {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String ola() {
        return "{\"message\": \"Olá, seja bem-vindo!\"}";
    }

    public static void main(String[] args) {
        SpringApplication.run(OlaResource.class, args);
    }
}
