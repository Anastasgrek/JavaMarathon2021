package day9.Task2;

public class Rectangle extends Figure{
    private double a; //length
    private double b; //width


    public Rectangle(int a, int b, String color) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * (this.a + this.b);
    }
}
