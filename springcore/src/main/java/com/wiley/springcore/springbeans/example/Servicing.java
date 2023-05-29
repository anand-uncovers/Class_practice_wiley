package com.wiley.springcore.springbeans.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicing {



    private Instrument myInstrument;

    @Autowired
    public Servicing(Instrument myInstrument) {
        this.myInstrument = myInstrument;
    }

    public void displayCarDetails() {
        System.out.println("Make: " +  myInstrument.getMake());
        System.out.println("Place: " +  myInstrument.getPlace());
        System.out.println("Year: " +  myInstrument.getYear());
    }
    
}