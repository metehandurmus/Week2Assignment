package dev.patika.business.concretes;

import dev.patika.business.abstracts.RentService;
import dev.patika.business.rules.RentBusinessRules;
import dev.patika.core.utilities.RentServiceHelper;
import dev.patika.entities.abstracts.Car;
import dev.patika.entities.abstracts.User;

public class RentManager implements RentService {

    RentBusinessRules rentBusinessRules;
    RentServiceHelper rentServiceHelper;

    public RentManager() {
        rentBusinessRules = new RentBusinessRules();
        rentServiceHelper = new RentServiceHelper();
    }

    @Override
    public boolean UserRentsACar(User user, Car car, String type) {
        System.out.println();

        // Business Rule
        if (rentBusinessRules.IsTypeFalse(type)) return false;
        if (rentBusinessRules.IsCivilianAndRentNotHatchback(user, car)) return false;
        if (rentBusinessRules.IsMonthlyAndRentHatchback(user, car, type)) return false;
        if (rentBusinessRules.HasMoneyForRenting(user, car, type)) return false;

        // Ara işlemler
        rentServiceHelper.PayToRentByUser(user, car, type);


        System.out.println(user.getName() + " " + type + " olarak " + car.getTypeName() + " kiraladı.");
        System.out.println("Bunun için " + rentServiceHelper.getHarcananPara() + "$ ödedi.");
        return true;
    }
}
