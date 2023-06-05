package dev.patika.business.rules;

import dev.patika.entities.abstracts.Car;
import dev.patika.entities.abstracts.User;
import dev.patika.entities.concretes.Admin;
import dev.patika.entities.concretes.Civilian;
import dev.patika.entities.concretes.Hatchback;

public class RentBusinessRules {

    public boolean HasMoneyForRenting(User user, Car car, String type) {
        double money = -1;
        if (type == "günlük") money = user.getBalance() - car.getDailyRentalFee();
        else if (type == "aylık") money = user.getBalance() - car.getMounthlyRentalFee();

        if (money < 0) {
            System.out.println(user.getName()+" adlı kullanıcının parası yetmedi.");
            return true;
        }
        return false;
    }

    public boolean IsTypeFalse(String type){
        if (type != "günlük" && type != "aylık") {
            System.out.println("Doğru bir tip girin.");
            return true;
        }
        return false;
    }

    public boolean IsCivilianAndRentNotHatchback(User user, Car car){
        if (user instanceof Civilian && !(car instanceof Hatchback)) {
            System.out.println("Normal vatandaşlar sadece hatchback kiralayabilir.");
            return true;
        }
        return false;
    }

    public boolean IsMonthlyAndRentHatchback(User user, Car car, String type){
        if (!(user instanceof Admin) && car instanceof Hatchback && type == "aylık") {
            System.out.println("Hatchback aylık olarak kiralanamaz. (Admin kiralayabilir)");
            return true;
        }
        return false;
    }
}
