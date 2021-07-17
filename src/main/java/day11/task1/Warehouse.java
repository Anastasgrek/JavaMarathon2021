package day11.task1;

public class Warehouse {
    private int countPickedOrders;     //Количество собранных заказов
    private int countDeliveredOrders;  //Количество доставленных заказов

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public String toString(){
        return "Количество собранных заказов: " + this.countPickedOrders + ", количество доставленных заказов: " + this.countDeliveredOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }
}
