package com.example.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    public void addNew(String name){
        System.out.println("Employee service add new:" + name);
    }
}
