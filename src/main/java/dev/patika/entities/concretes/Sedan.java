package dev.patika.entities.concretes;

import dev.patika.entities.abstracts.Car;

public class Sedan extends Car {

    public Sedan(double baggageCapacity, double dailyRentalFee, String color) {
        super(baggageCapacity, dailyRentalFee, color, "Sedan");
    }
}
