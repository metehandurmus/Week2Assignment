package dev.patika.entities.concretes;

import dev.patika.entities.abstracts.User;

public class Company extends User {
    public Company(String name, double balance) {
        super(name, balance);
    }
}
