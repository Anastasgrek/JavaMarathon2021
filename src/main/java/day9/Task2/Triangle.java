package day9.Task2;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;


    public Triangle(int a, int b, int c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double area() {
        double poluPerimeter = (a + b + c) / 2;
        return Math.sqrt(poluPerimeter * (poluPerimeter - a) * (poluPerimeter - b) * (poluPerimeter - c));
    }

    @Override
    public double perimeter() {
        return this.a + this.b + this.c;
    }
}
