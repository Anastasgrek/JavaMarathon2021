package day11.task1;

public class Task1 {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        Worker picker = new Picker(warehouse);
        Worker courier = new Courier(warehouse);

        bisinessProcess(picker);
        bisinessProcess(courier);

        System.out.println(warehouse);


        Warehouse warehouse1 = new Warehouse();

        Worker picker1 = new Picker(warehouse1);
        Worker courier1 = new Courier(warehouse1);

        bisinessProcess(picker1);
        bisinessProcess(courier1);

        System.out.println(warehouse1);

    }

    static void bisinessProcess(Worker worker){
        for (int i = 0; i < 10000; i ++){
            worker.doWork();
        }
        worker.bonus();
    }

}
