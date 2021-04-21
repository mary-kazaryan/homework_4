package TeachMeSkills;

import java.util.Random;

public class Task5 {

    // Создайте двумерный массив.
    // Выведите на консоль диагонали массива.

    public static void main(String[] args) {

        int[][] array = new int[5][5];
        Random enter = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = enter.nextInt(10);

                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Диагональ А");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }

        System.out.println();
        System.out.println("Диагональ Б");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i + j == array.length - 1) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }

    }
}






