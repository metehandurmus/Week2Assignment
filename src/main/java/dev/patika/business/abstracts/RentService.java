package dev.patika.business.abstracts;

import dev.patika.entities.abstracts.Car;
import dev.patika.entities.abstracts.User;

public interface RentService {
    public boolean UserRentsACar(User user, Car car, String type);
}
