package io.github.tingreavinash.springbootproblems.entity;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int id;
    private String name;

    public Employee(String name){
        this.name = name;
    }

}
