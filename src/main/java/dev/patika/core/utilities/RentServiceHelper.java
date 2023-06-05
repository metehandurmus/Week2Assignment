package dev.patika.core.utilities;

import dev.patika.entities.abstracts.Car;
import dev.patika.entities.abstracts.User;
import dev.patika.entities.concretes.SUV;
import dev.patika.entities.concretes.Sedan;

public class RentServiceHelper {
    private double harcananPara;

    public double getHarcananPara() {
        return harcananPara;
    }

    public void PayToRentByUser(User user, Car car, String type) {
        if (type == "günlük") {
            this.harcananPara = car.getDailyRentalFee();
        }

        else if (type == "aylık") {
            this.harcananPara = car.getMounthlyRentalFee();
        }

        user.setBalance(user.getBalance() - this.harcananPara);
    }
}
