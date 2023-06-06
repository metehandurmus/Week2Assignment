package dev.patika.entities.concretes;

import dev.patika.entities.abstracts.Car;

public class FourWheelDrive extends Car {
    private FourWheelDrive(Builder builder) {
        super(builder);
    }

    public static class Builder extends Car.Builder {
        @Override
        public FourWheelDrive build() {
            this.setTypeName("Four Wheel Drive");
            return new FourWheelDrive(this);
        }
    }
}
