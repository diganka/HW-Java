package HW16;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        String num = input.next();
        boolean palindrom = false;
        for (int a=0; a<=num.length()-1; a++){
            for (int b=num.length()-1; b>=0; b--) {
                if (num.charAt(a) == num.charAt(b)){
                    palindrom = true;
                }
                else {
                    palindrom = false;
                }
            }
        }
        System.out.println(palindrom);
    }
}
   /* Написать программу в которой пользователь вводит с клавиатуры число,
        а программа определяет, является она полиндромом или нет.
        И выводит данную информацию на экран.*/