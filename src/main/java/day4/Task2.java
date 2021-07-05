package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        int max = array[0];
        int min = array[0];
        int counter = 0;
        int sum = 0;

        for (int x : array) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
            if (x % 10 == 0) {
                counter++;
                sum = sum + x;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(max + " " + min + " " + counter + " " + sum);

    }
}
