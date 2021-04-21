package TeachMeSkills;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        /* Создать трехмерный массив из целых чисел.
        С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
        Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
        */

        Scanner sc = new Scanner(System.in);
        int entered = sc.nextInt();

        int[][][] numbers = {{
                {100, 200, 300}},
                {{700, 500, 300}
                }};

        for (int[][] third: numbers) {
            for (int [] second: third) {
                for (int first: second) {
                    first += entered;

                    System.out.print(first + " ");
                }

            }

        }

    }
}
