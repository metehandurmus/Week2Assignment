package dev.patika.entities.concretes;

import dev.patika.entities.abstracts.Car;

public class FourWheelDrive extends Car {
    public FourWheelDrive(double baggageCapacity, double dailyRentalFee, String color) {
        super(baggageCapacity, dailyRentalFee, color, "Four Wheel Drive");
    }
}
