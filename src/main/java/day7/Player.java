package day7;

public class Player {
    //Constants
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;

    //Atributes
    private int stamina;
    private static int countPlayers = 0;

    public Player(int stamina){
        if (countPlayers == 6){
            return;
        }
        this.stamina = stamina;
        countPlayers ++;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }
    public void run() {

        if (stamina > MIN_STAMINA){
            stamina = stamina - 1;
            if(stamina == MIN_STAMINA) {
                System.out.println("Игроку нужен отдых, он покидает поле");
                countPlayers = countPlayers - 1;
            }
        }
    }

    public static void info() {
        if (countPlayers < 6){
            int leftPlace = 6 - countPlayers;
            switch (leftPlace){
                case 1:
                    System.out.println("Команды неполные. На поле еще есть " + leftPlace + " свободное место");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Команды неполные. На поле еще есть " + leftPlace + " свободных места");
                    break;
                case 5:
                case 6:
                    System.out.println("Команды неполные. На поле еще есть " + leftPlace + " свободных мест");
            }

        }else{
            System.out.println("На поле нет свободных мест");
        }
    }

}
