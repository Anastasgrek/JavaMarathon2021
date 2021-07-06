package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setYear(2000);
        car.info();
        System.out.println(car.yearDifference(2021));


        Motorbike motorbike = new Motorbike(1998, "Green", "Honda");
        motorbike.info();
        System.out.println(motorbike.yearDifference(2021));

    }
}
