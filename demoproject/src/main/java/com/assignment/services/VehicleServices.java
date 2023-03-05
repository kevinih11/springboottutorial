package com.assignment.services;

import com.assignment.interfaces.Speakers;
import com.assignment.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    @Autowired  //auto-wire in field method
    private Speakers Speakers;

    private Tyres tyres;

    public void playMusic(){
        String music = Speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String status = tyres.rotate();
        System.out.println(status);
    }

    public Speakers getSpeakers() {
        return Speakers;
    }

    public void setSpeakers(Speakers speakers) {
        Speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired //auto-wire in setter method
    public void setTyres(Tyres tyres){
        this.tyres = tyres;
    }
}
