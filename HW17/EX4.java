package HW17;

import java.util.Arrays;
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива (четное число): ");
        int size = scanner.nextInt();
        if (size % 2 != 0) {
            System.out.println("Ошибка: размер массива должен быть четным числом!");
            return;
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Изначальный массив: " + Arrays.toString(array));
        Arrays.sort(array, 0, size / 2);
        Arrays.sort(array, size / 2, size);
        for (int i = 0; i < size / 2 / 2; i++) {
            int temp = array[size / 2 + i];
            array[size / 2 + i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}

/*
Имеется массив, размер которого должен быть четным числом и  этот размер вводится пользователем с клавиатуры.
        Значения элементов задаются случайным образом в диапазоне от 0 до 100.
        Отсортировать первую половину данного массива по возрастанию, а вторую по
        убыванию. Вывести на экран изначальный и отсортированный массив.*/
