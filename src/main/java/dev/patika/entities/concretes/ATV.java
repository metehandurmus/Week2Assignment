package dev.patika.entities.concretes;

import dev.patika.entities.abstracts.Car;

public class ATV extends Car {
    public ATV(double baggageCapacity, double dailyRentalFee, String color) {
        super(baggageCapacity, dailyRentalFee, color, "ATV");
    }
}
