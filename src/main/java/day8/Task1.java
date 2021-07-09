package day8;

/**
 * Используя метод append() класса StringBuilder программа выполнилась в ~60 раз быстрее, чем через конкатинацию строк.
 */

public class Task1 {
    public static void main(String[] args) {

        final long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < 20001; i++){
            sb.append(i);
            sb.append(" ");
        }

        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));

        //Конкатинация строки в цикле
        final long startTime1 = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < 20001; i++){
            s += (" " + i);
        }

        final long endTime1 = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime1 - startTime1));

    }
}
