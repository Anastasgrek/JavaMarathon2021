package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Boing", 2000, 200, 10000);

        airplane.setYear(2001);
        airplane.setLength(150);
        airplane.fillUp(50);
        airplane.fillUp(100);
        airplane.info();

    }
}
