package day8;

public class Airplane {
    private String producer;  //изготовитель
    private int year;         //год выпуска
    private int length;       // длина самолета
    private int weight;       //Масса самолета
    private int fuel;         //Количество топлива в баке


    public Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
     public void info() {
         System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: "
                 + length + ", вес: " + weight + ", количество топлива в баке: " + fuel );
     }

     public void fillUp(int n) {
        this.fuel = this.fuel + n;
     }

    public void setLength(int length) {
        this.length = length;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    //Переопределим метод toString() для того чтобы

    public String toString(){
        return "Изготовитель: " + producer + ", год выпуска: " + year + ", длина: "
                + length + ", вес: " + weight + ", количество топлива в баке: " + fuel;
    }

}
