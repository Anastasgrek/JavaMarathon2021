package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];

        int sum = 0;
        int counter8 = 0;
        int counter1 = 0;
        int counterMod = 0;
        int counterNotMod = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 10);
            sum = sum + array[i];  // Сумма всех элементов массива
        }

        for (int x : array) {
            if (x > 8) {
                counter8++;
            }
            if (x == 1) {
                counter1++;
            }
            if (x % 2 == 0) {
                counterMod++;
            }
            if (x % 2 != 0) {
                counterNotMod++;
            }
        }

        System.out.println("Введено число " + n + "."
                + " Сгенерирован следующий массив:\n" + Arrays.toString(array) + "\n"
                + "Информация о массиве: \n"
                + "Длина массива: " + array.length + "\n"
                + "Количество чисел больше 8: " + counter8 + "\n"
                + "Количество чисел равных 1: " + counter1 + "\n"
                + "Количество четных чисел: " + counterMod + "\n"
                + "Количество нечетных чисел: " + counterNotMod + "\n"
                + "Сумма всех элементов массива: " + Arrays.stream(array).sum());



    }
}
