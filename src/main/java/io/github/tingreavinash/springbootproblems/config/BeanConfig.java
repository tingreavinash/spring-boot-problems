package io.github.tingreavinash.springbootproblems.config;

import io.github.tingreavinash.springbootproblems.entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {

    @Bean("AvinashBean")
    public Employee getAvinash(){
        return new Employee("Avinash");
    }

    @Bean("AtulBean")
    @Primary
    public Employee getAtul(){
        return new Employee("Atul");
    }
}
