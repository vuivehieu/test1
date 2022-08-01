package com.example.test1;

import org.springframework.stereotype.Component;

@Component
public class AddressService {
    public void addNew(String name){
        System.out.println("Address service add new:" + name);
    }
}
