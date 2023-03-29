package HW17;

import java.util.Random;

public class EX3 {
    public static void main(String[] args) {
        int[] arr = new int[45];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101) - 50;
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}
   /* Заполнить массив на 45 элементов случайными числами
        от -50 до +50. Найти минимальный элемент и вывести его
        на консоль. Найти максимальный элемент и вывести его на
        консоль.*/
