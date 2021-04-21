package TeachMeSkills;

import java.math.*;
import java.util.Arrays;
import java.util.Random;

public class Task6 {

    public static void main(String[] args) {

        // Создайте двумерный массив целых чисел.
        // Отсортируйте элементы в строках двумерного массива по возрастанию.

        int[][] array = new int[5][5];

        Random random = new Random();

        System.out.println("Before: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(100);

                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("\n" + "After: ");

        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
            System.out.println(Arrays.toString(array[i]));
        }
    }
}


