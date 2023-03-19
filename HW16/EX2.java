package HW16;

import java.util.Scanner;

public class EX2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string = input.nextLine();
         int count = 0;
        string = string.replaceAll("\\s","");
        int index = string.indexOf("а");
           while (index!=-1) {
             count ++;
             string = string.substring(index+1);
             index = string.indexOf("а");
           }
         System.out.print(count);
        }
      }


    /*При помощи цикла while выполнить реализацию следующего алгоритма.
        Пользователь вводит строку с клавиатуры. Программа должна вывести на
        экран сколько символов "a", присутсвует в данной строке.*/