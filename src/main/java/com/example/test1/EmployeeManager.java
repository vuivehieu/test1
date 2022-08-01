package com.example.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class EmployeeManager {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private AddressService addressService;

    @PostConstruct
    private void init() {
        System.out.println("EmployeeManager created");
    }
    public void addNew(String name, String address) {
        System.out.println("EmployeeManager start");
        employeeService.addNew(name);
        addressService.addNew(address);
        System.out.println("EmployeeManager end");
    }
}
