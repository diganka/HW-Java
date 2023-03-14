package HW15;

import java.util.Date;
import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Уважаемый(-ая) X, Вы выполняете задание номер Y, и делаете это в Z часов W минут в V");
        System.out.println("Введите имя:");
        String name = input.nextLine();
        System.out.println("Введите номер задания:");
        int ex = input.nextInt();
        System.out.println("Введите время в часах, минутах");
        String time = input.nextLine();
        input.nextLine();
        System.out.println("Введите день недели выполнения ДЗ");
        String day = input.nextLine();
        Date date = new Date();
        System.out.printf("Уважаемый(-ая) %1$s, Вы выполняете задание номер %2$d " +
                "и делаете это в %3$tH часов %3$tM минут в %3$tA.",name,ex,date);
    }
}
    /*Написать программу, где пользователю на консоль выводится следующее сообщение:
        Уважаемый X, Вы выполняете задание номер Y, и делаете это в Z часов W минут в V.
        После пользоватею предложат ввести свое имя, номер задания.
        А также ввести спицификаторы формата вместо X, Y, Z, W, V.
        где X - это имя пользователя,
        Y - порядковый номер ДЗ,
        Z - время в часах в момент выполнения программы,
        W - время в минутах в момент выполнения программы,
        V - день недели.*/