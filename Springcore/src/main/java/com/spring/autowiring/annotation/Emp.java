package com.spring.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;


public class Emp {
    @Autowired
    Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setting value....");
        this.address = address;
    }

    public Emp() {
        super();
    }

    public Emp(Address address) {
        super();
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" + "address=" + address + '}';
    }
    
    
    
    
    
}
