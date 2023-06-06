package dev.patika.entities.abstracts;

import dev.patika.entities.concretes.Sedan;

public abstract class Car {
    private double baggageCapacity;
    private double dailyRentalFee;
    // Hatchback sadece günlük kiralanabiliyor.
    // Demek ki tüm arabalar aylık kiralama ücretine sahip değil.
    // O yüzden aylık kiralama ücretini abstract class'a koymadık.
    private String color;
    private String typeName;

    protected Car(Builder builder) {
        this.baggageCapacity = builder.baggageCapacity;
        this.dailyRentalFee = builder.dailyRentalFee;
        this.color = builder.color;
        this.typeName = builder.typeName;
    }

    public double getBaggageCapacity() {
        return baggageCapacity;
    }

    public void setBaggageCapacity(double baggageCapacity) {
        this.baggageCapacity = baggageCapacity;
    }

    public double getDailyRentalFee() {
        return dailyRentalFee;
    }

    public void setDailyRentalFee(double dailyRentalFee) {
        this.dailyRentalFee = dailyRentalFee;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeName() {
        return typeName;
    }

    public double getMounthlyRentalFee() {
        return this.dailyRentalFee * 30;
    }

    public abstract static class Builder {
        protected double baggageCapacity;
        protected double dailyRentalFee;
        protected String color;
        protected String typeName;

        public Builder setBaggageCapacity(double baggageCapacity) {
            this.baggageCapacity = baggageCapacity;
            return this;
        }

        public Builder setDailyRentalFee(double dailyRentalFee) {
            this.dailyRentalFee = dailyRentalFee;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }

        public Builder setAge(int age) {
            return this;
        }

        public abstract Car build();
    }
}
