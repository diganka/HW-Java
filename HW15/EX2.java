package HW15;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите три целочисленных значения:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean result=a+b>c&&a+c>b&&b+c>a&&c<a+b&&b<a+c&&a<c+b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.printf("Треугольник существует %b",result);

    }
}
    /*Пользователь вводит с клавиатуры три целочисленных значения
        На экран выводится информация можно ли из этих сторон
        построить треугольник.*/