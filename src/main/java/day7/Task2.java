package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random(); // создаем объект класса рандом
        int stamina90 = 90;

        Player player1 = new Player(stamina90 + random.nextInt(Player.MAX_STAMINA - stamina90 + 1)); // в качестве значения задается случайное в диапазоне от 90 до 100
        Player player2 = new Player(stamina90 + random.nextInt(Player.MAX_STAMINA - stamina90 + 1));
        Player player3 = new Player(stamina90 + random.nextInt(Player.MAX_STAMINA - stamina90 + 1));
        Player player4 = new Player(stamina90 + random.nextInt(Player.MAX_STAMINA - stamina90 + 1));
        Player player5 = new Player(stamina90 + random.nextInt(Player.MAX_STAMINA - stamina90 + 1));
        Player player6 = new Player(stamina90 + random.nextInt(Player.MAX_STAMINA - stamina90 + 1));

        Player.info();

        int stamina1 = player1.getStamina();
        for (int i = 0; i < stamina1; i++){
            player1.run();
        }

        System.out.println(player1.getStamina());

        Player.info();
    }
}
