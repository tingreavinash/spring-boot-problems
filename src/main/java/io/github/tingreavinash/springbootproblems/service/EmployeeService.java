package io.github.tingreavinash.springbootproblems.service;

import io.github.tingreavinash.springbootproblems.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    @Qualifier("AtulBean")
    private Employee employee;

    public void display(){
        System.out.println(employee.getName());
    }
}
