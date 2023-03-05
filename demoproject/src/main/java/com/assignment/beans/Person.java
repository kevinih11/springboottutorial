package com.assignment.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// give component custom bean name
@Component(value="personBean")
public class Person {

    private String name = "Lucy";
    private final Vehicle vehicle;   // final --> no setter method

    @Autowired
    public Person(Vehicle vehicle){   //declare this way: can use final key word in field
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
