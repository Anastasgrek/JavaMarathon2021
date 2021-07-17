package day11.task1;

public class Picker implements Worker{
    private final int BONUS = 70000; // Бонус для курьера
    private String name;
    private int salary;
    private boolean isPayed;
    private Warehouse wareHouse;

    public Picker(Warehouse warehouse) {
        this.wareHouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString(){
        return "Зарплата Сборщика: " + this.salary + ", Был выплачен бонус или нет: " + this.isPayed;
    }


    @Override
    public void doWork() {

        salary = salary + 80;
        wareHouse.setCountPickedOrders(wareHouse.getCountPickedOrders() + 1);
    }

    @Override
    public void bonus() {
        if (this.isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (wareHouse.getCountPickedOrders() < 10000){
            System.out.println("Бонус пока не доступен");
            return;
        }
        salary = salary + BONUS;
        System.out.println("бонус выплачен с учетом зарплаты: " + salary);
        this.isPayed = true;

    }

    @Override
    public void getSulary() {
        System.out.println("ЗП сборщика: " + salary);
    }

    @Override
    public void getCountDeliveredOrders() {

    }
}

