package dev.patika.entities.concretes;

import dev.patika.entities.abstracts.Car;

public class SUV extends Car {
    private int age;
    private final double AGE_CONSTANT = 150;

    private SUV(Builder builder) {
        super(builder);
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

    public static class Builder extends Car.Builder {
        private int age;

        @Override
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        @Override
        public SUV build() {
            this.setTypeName("SUV");
            SUV suv = new SUV(this);
            suv.age = this.age;
            return suv;
        }
    }
}
