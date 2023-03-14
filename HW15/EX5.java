package HW15;

import java.util.Date;
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите нынешнеее время в формате HH:MM:SS:");
        String time = input.nextLine();
        Date date = new Date();
        System.out.printf("Cейчас время: %tT", date);
        System.out.println("\nВведите сегоднешнею дату в формате dd/mm/yyyy:");
        String date2 = input.nextLine();
        System.out.printf("Cегодня %1$td/%1$tm/%1$tY", date);
    }
}
    /*Написать алгоритм, где у пользователя просят ввести
    спецификатор формата для нынешнего времени либо даты.
        И в зависимости от ввода этого спецификатора на консоль
        будет выводится дата либо время в указанном формате.*/

