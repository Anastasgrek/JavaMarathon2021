package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < 100; i ++) {
            array[i] = (int) (Math.random() * 10000);
        }
        int sumThreeElement;
        int max = array[0] + array[1] + array[2];
        int index = 0;
        for (int i = 0; i < 100 - 3; i ++) {
            sumThreeElement = array[i] + array[i + 1] + array[i + 2];
            if ( sumThreeElement > max){
                max = sumThreeElement;
                index = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(max);
        System.out.println(index);
    }
}
