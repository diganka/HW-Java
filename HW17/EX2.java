package HW17;

import java.util.Random;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        int[] a = new int [10];
            Random random = new Random();
              for (int i = 0; i < a.length; i++) {
                a [i] = random.nextInt(100);
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число для поиска: ");
            int number = scanner.nextInt();

             boolean number2 = false;
               for (int i = 0; i < a.length; i++) {
                  if (a [i] == number) {
                      number2 = true;
                      break;
                }
            }
                   if (number2) {
                System.out.println("Число " + number + " найдено в массиве");
                   } else {
                System.out.println("Число " + number + " не найдено в массиве");
            }
        }
    }

    /*Есть одномерный массив из 10 элементов, заполнен-
        ный случайными числами. Пользователь вводит с клавиатуры
        число. Программа показывает есть ли такое число в созданном
        до этого массиве.*/