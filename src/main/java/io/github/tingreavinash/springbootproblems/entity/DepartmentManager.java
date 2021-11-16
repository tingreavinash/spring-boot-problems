package io.github.tingreavinash.springbootproblems.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DepartmentManager implements Manager{
    @Override
    public String getManagerName() {
        return "Department Manager";
    }
}
