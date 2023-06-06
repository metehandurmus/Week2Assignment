package dev.patika.entities.concretes;

import dev.patika.entities.abstracts.Car;

public class ATV extends Car {
    private ATV(Builder builder) {
        super(builder);
    }

    public static class Builder extends Car.Builder {
        @Override
        public ATV build() {
            this.setTypeName("ATV");
            return new ATV(this);
        }
    }
}
