package dev.patika;

import dev.patika.business.abstracts.RentService;
import dev.patika.business.concretes.RentManager;
import dev.patika.entities.abstracts.Car;
import dev.patika.entities.abstracts.User;
import dev.patika.entities.concretes.*;

public class Main {
    public static void main(String[] args) {
        RentService rentService = new RentManager();

        Civilian civilian = new Civilian("Normal Vatandaş", 50000);
        Company company = new Company("Şirket", 500000);
        Admin admin = new Admin("Admin");

        Car suv = new SUV
                .Builder()
                .setColor("Red")
                .setDailyRentalFee(200)
                .setBaggageCapacity(20)
                .setAge(10)
                .build();

        Car hatchback = new Hatchback
                .Builder()
                .setColor("Red")
                .setDailyRentalFee(200)
                .setBaggageCapacity(20)
                .build();

        Car sedan = new Sedan.Builder()
                .setColor("Red")
                .setDailyRentalFee(200)
                .setBaggageCapacity(20)
                .build();

        Car fourWheelDrive = new FourWheelDrive
                .Builder()
                .setColor("Blue")
                .setDailyRentalFee(2000)
                .setBaggageCapacity(50)
                .build();

        Car atv = new ATV.Builder()
                .setColor("Blue")
                .setDailyRentalFee(1000)
                .setBaggageCapacity(50)
                .build();


        User user = company; // yalnızca bu satırı değiştirerek aşağıdaki işlemleri dinamikleştirebilirsiniz.

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