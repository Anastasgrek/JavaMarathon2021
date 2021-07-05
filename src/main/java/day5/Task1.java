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


    }


}
