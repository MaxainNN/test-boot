package com.example.test_boot.employess;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository){
        return (args) -> {
        var employeeList = List.of(
                    new Employee(
                    null,
                    "Max",
                    "Max@gmail.com",
                    LocalDate.of(2001,1,2),
                    100000
                ),
                new Employee(
                        null,
                        "Elen",
                        "Elen@gmail.com",
                        LocalDate.of(2002,3,4),
                        150000
                )
            );
        employeeRepository.saveAll(employeeList);
        };
    }
}
