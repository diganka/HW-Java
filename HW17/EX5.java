package HW17;

import java.util.Scanner;

public class EX5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = count; i>0; i--) {
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = count; i>0; i--) {
            for (int a = 0; a < i; a++) {
                if (a == 0 || a ==i-1 || i == count) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

    /*Необходимо вывести на экран перевернутый прямоугольный треугольник
        прямым углом сверху в левой части.
        Для вывода использовать условные операторы, циклы.
        Команду System.out.println(); System.out.print(); и можно использовать только
        с одним символом *.
        Пользователь вводит с клавиатуры число, которое будет считаться основанием треугольника,
        а программа выводит сам треугольник.
        Пример с числом 7:
        *******
        *    *
        *   *
        *  *
        * *
        *
        Необходимо написать программу для вывода
        вначале заполненного, а потом и пустого треугольника.*/