package io.github.tingreavinash.springbootproblems.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class GeneralManager implements Manager{

    @Override
    public String getManagerName() {
        return "General Manager";
    }
}
