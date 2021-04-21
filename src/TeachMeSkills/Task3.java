package TeachMeSkills;

import java.util.*;


public class Task3 {

    public static void main(String[] args) {

        //  Шахматная доска:
        //  Создать программу для расскаски шахматной доски с помощью цикла.
        //  Создать двумерный массив String 8х8.
        //  С помощью циклов задать элементам цикла значения B(Black) или W(White).
        //  Результат работы программы:
        //  W  B  W  B  W  B  W  B
        //  B  W  B  W  B  W  B  W
        //  W  B  W  B  W  B  W  B
        //  B  W  B  W  B  W  B  W
        //  W  B  W  B  W  B  W  B
        //  B  W  B  W  B  W  B  W
        //  W  B  W  B  W  B  W  B
        //  B  W  B  W  B  W  B  W

        String[][] chess = new String[8][8];

        for (int i = 0; i < chess.length; i++) {
            for (int n = 0; n < chess[1].length; n++) {
                if ((i + n) % 2 == 0) {
                    chess[i][n] = "W";
                } else chess[i][n] = "B";
                System.out.print(chess[i][n] + "\t");
            }   System.out.println();
        }
    }
}
