package dev.patika.entities.concretes;

import dev.patika.entities.abstracts.Car;

public class Sedan extends Car {

    private Sedan(Builder builder) {
        super(builder);
    }

    public static class Builder extends Car.Builder {
        @Override
        public Sedan build() {
            this.setTypeName("Sedan");
            return new Sedan(this);
        }
    }
}
