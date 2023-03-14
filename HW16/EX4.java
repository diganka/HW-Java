package HW16;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите слово:");
        String word = " ";
        while (true){
            String line = input.nextLine();
            if (line.equals("STOP"))
                break;
            word +=" "+line;
        }
        System.out.println(word.trim());
    }
}
    /*Написать программу, которая будет считывать введенные пользователем
    слова с клавиатуры слова, и склеивать их в одно предложение до тех пор,
    пока пользователь не введет с клавитуры слово STOP.
        Все слова введенные до этого должны отобразится в консоли
        одним предложением.*/