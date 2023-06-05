package dev.patika.entities.concretes;

import dev.patika.entities.abstracts.User;

public class Admin extends User {
    public Admin(String name) {
        super(name, 99999999999d);
    }
}
