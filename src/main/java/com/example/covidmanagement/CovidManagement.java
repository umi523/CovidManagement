package com.example.covidmanagement;

import com.example.covidmanagement.Victim.Victim;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@SpringBootApplication
@RestController
public class CovidManagement {

    public static void main(String[] args) {
        SpringApplication.run(CovidManagement.class, args);
    }
}
