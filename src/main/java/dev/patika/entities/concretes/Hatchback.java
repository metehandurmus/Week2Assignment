package dev.patika.entities.concretes;

import dev.patika.entities.abstracts.Car;

public class Hatchback extends Car {
    public Hatchback(double baggageCapacity, double dailyRentalFee, String color) {
        super(baggageCapacity, dailyRentalFee, color, "Hatchback");
    }
}
