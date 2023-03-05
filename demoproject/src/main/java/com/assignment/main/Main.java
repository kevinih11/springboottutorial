package com.assignment.main;

import com.assignment.beans.Person;
import com.assignment.beans.Vehicle;
import com.assignment.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();
//        person.getVehicle().getVehicleServices().playMusic();
//        person.getVehicle().getVehicleServices().moveVehicle();
    }
}
