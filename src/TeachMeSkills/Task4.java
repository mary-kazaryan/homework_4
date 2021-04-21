package TeachMeSkills;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

// Умножение двух матриц:
// Создайте два массива целых чисел размером 3х3 (две матрицы).
// Напишите программу для умножения двух матриц.
// Первый массив:{{1,0,0,0},{0,1,0,0},{0,0,0,0}}
// втрой массив:{{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
// Ожидаемый результат:  1  2  3   1  1  1   0  0  0

        int[][] array1 =
                {{1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}};

        int[][] array2 =
                {{1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}};

        int num1 = array1.length;
        int num2 = array2[0].length;
        int[][] array3 = new int[num1][num2];

        for (int i = 0; i < num1; i++) {
            for (int n = 0; n < num2; n++) {
                for (int k = 0; k < array2.length; k++) {
                    array3[i][n] += array1[i][k] * array2[k][n];
                }
                System.out.print(array3[i][n] + "\t");
            }
            System.out.println();
        }
    }
}

