package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];

        for (int i = 0; i < 12; i ++){
            for (int j = 0; j < 8; j ++){
                array[i][j] = (int)(Math.random() * 50);
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }

        int max = 0;
        int index = 0;
        int[] array2  = new int[12];
        int i = 0;

        for (int[] x: array){
            array2[i] = Arrays.stream(x).sum();
            i ++;
            }
        for (int a = 0; a < array2.length; a++){
            if (array2[a] > max){
                max = array2[a];
                index = a;
            }
        }

        System.out.println(Arrays.toString(array2));
        System.out.println(max + " " + index);
        }


    }
