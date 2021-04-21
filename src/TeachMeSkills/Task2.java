package TeachMeSkills;

public class Task2 {

    public static void main(String[] args) {

        // Создайте двумерный массив целых чисел.
        // Выведите на консоль сумму всех элементов массива.

        int [][] numbers = {{17, 45, 83},{15, 62, 49}};


        int sum = 0;

        for (int [] second: numbers) {
            for (int first: second) {
                sum = sum + first;

            }
        }

        System.out.println(sum);
    }
}
