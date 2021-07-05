package day5;

import org.w3c.dom.ls.LSOutput;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();

        car.setYear(2021);
        car.setColor("Green");
        car.setModel("Kia");

        System.out.println(car.getYear());
        System.out.println(car.getColor());
        System.out.println(car.getModel());

        Motorbike motorbike = new Motorbike(2020, "Red", "Honda");

        System.out.println(motorbike.getYear());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getModel());

    }


}
