package dev.patika.entities.concretes;

import dev.patika.entities.abstracts.Car;

public class Hatchback extends Car {
    private Hatchback(Builder builder) {
        super(builder);
    }

    public static class Builder extends Car.Builder {
        @Override
        public Hatchback build() {
            this.setTypeName("Hatchback");
            return new Hatchback(this);
        }
    }
}
