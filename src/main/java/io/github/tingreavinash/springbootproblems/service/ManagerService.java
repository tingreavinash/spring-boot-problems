package io.github.tingreavinash.springbootproblems.service;

import io.github.tingreavinash.springbootproblems.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    @Autowired
    //@Qualifier("generalManager")
    private Manager manager;

    public Manager getManager(){
        return manager;
    }
}
