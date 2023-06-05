package dev.patika.entities.concretes;

import dev.patika.entities.abstracts.Car;

public class SUV extends Car {
    private int age;
    private final double AGE_CONSTANT = 150;

    public SUV(double baggageCapacity, double dailyRentalFee, String color, int age) {
        super(baggageCapacity, dailyRentalFee, color, "SUV");
        this.age = age;
    }

    @Override
    public double getMounthlyRentalFee() {
        return (this.getDailyRentalFee() * 30) - (AGE_CONSTANT * age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
