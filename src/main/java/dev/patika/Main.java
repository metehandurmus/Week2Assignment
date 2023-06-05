package dev.patika;

import dev.patika.business.abstracts.RentService;
import dev.patika.business.concretes.RentManager;
import dev.patika.entities.abstracts.User;
import dev.patika.entities.concretes.*;

public class Main {
    public static void main(String[] args) {
        RentService rentService = new RentManager();

        Civilian civilian = new Civilian("Normal Vatandaş", 50000);
        Company company = new Company("Şirket", 500000);
        Admin admin = new Admin("Admin");

        SUV suv = new SUV(20, 200, "Red", 10);
        Hatchback hatchback = new Hatchback(20, 200, "Red");
        Sedan sedan = new Sedan(20, 200, "Red");
        FourWheelDrive fourWheelDrive = new FourWheelDrive(50, 2000, "Blue");
        ATV atv = new ATV(50, 1000, "Blue");

        User user = civilian; // yalnızca bu satırı değiştirerek aşağıdaki işlemleri dinamikleştirebilirsiniz.

        System.out.println("Başlangıç bakiyesi: " + user.getBalance() + "$");

        rentService.UserRentsACar(user, suv, "günlük");
        rentService.UserRentsACar(user, suv, "aylık");

        rentService.UserRentsACar(user, hatchback, "günlük");
        rentService.UserRentsACar(user, hatchback, "aylık");

        rentService.UserRentsACar(user, sedan, "günlük");
        rentService.UserRentsACar(user, sedan, "aylık");

        rentService.UserRentsACar(user, fourWheelDrive, "günlük");
        rentService.UserRentsACar(user, fourWheelDrive, "aylık");

        rentService.UserRentsACar(user, atv, "günlük");
        rentService.UserRentsACar(user, atv, "aylık");

        System.out.println("\nKalan bakiye durumu: " + user.getBalance() + "$");
    }
}