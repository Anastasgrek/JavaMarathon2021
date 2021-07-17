package day11.task1;

public class Courier implements Worker{
    private final int BONUS = 50000; // Бонус для курьера

    private String name;
    private int salary;
    private boolean isPayed;
    private Warehouse wareHouse;
//    public static int countCourier = 0; // для подсчета количества курьеров. Для отладки.
    private int count;

    public Courier(Warehouse warehouse) {
        this.wareHouse = warehouse;
//        countCourier ++;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString(){
        return "Зарплата Курьера: " + this.salary + ", Был выплачен бонус или нет: " + this.isPayed;
    }

    @Override
    public void doWork() {

        salary = salary + 100;
        wareHouse.setCountDeliveredOrders(wareHouse.getCountDeliveredOrders() + 1);

        count ++;
    }

    @Override
    public void bonus() {
        if (this.isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }

        if (wareHouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
//            System.out.println("Количество работников: " + countCourier);
            return;
        }
        salary = salary + BONUS;
        System.out.println("Бонус выплачен с учетом зарплаты: " + salary);
//        System.out.println("Количество работников: " + countCourier);
        this.isPayed = true;

    }

    @Override
    public void getSulary() {
        System.out.println("ЗП курьера: " + salary);
    }

    @Override
    public void getCountDeliveredOrders() {
        System.out.println(count);
    }
}
