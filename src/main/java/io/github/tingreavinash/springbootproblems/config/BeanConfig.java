package io.github.tingreavinash.springbootproblems.config;

import io.github.tingreavinash.springbootproblems.entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean("AvinashBean")
    public Employee getAvinash(){
        return new Employee("Avinash");
    }

    @Bean("AtulBean")
    public Employee getAtul(){
        return new Employee("Atul");
    }
}
