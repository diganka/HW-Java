package HW17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        String [] name = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int [] time = {10, 12, 14, 16, 18, 20};
        String [] place = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = input.nextInt();

        while (!(num < name.length&&num>=0)){
            System.out.println("Введите число от 0 до "+(name.length-1));
            num = input.nextInt();
        }
        System.out.println("Введите число:");
        int num2 = input.nextInt();
        while (!(num2 < time.length&&num2>=0)){
            System.out.println("Введите число от 0 до "+(time.length-1));
            num2 = input.nextInt();
    }
        System.out.println("Введите число:");
        int num3 = input.nextInt();
        while (!(num3 < place.length&&num3>=0)) {
            System.out.println("Введите число от 0 до " + (place.length - 1));
            num3 = input.nextInt();

        }
        String name1 = name[num];
        String place1 = place[num2];
        int time1 = time[num3];

        System.out.println(name1 + " будет идти в " + place1 + " в " + time1 + ":00");

    }
}
    /*Создать три массива.
        Первый будет состоять из следующих имен:
        "Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб".
        Второй будет содержать следующие значения типа int:
        10, 12, 14, 16, 18, 20.
        Третий будет содержать следующие значения:
        "школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику".
        Пользователь вводит три числа с клавиатуры, которые будут соответствовать
        индексам каждого из элементов массивов.
        Пример1. после ввода 3,2,1:
        На экране должно вывестись следующее сообщение:
        "Федя будет идти в магазин в 14:00"
        Пример2. после ввода 1,2,3:
        На экране должно вывестись следующее сообщение:
        "Маша будет идти в тренажерный зал в 14:00"*/