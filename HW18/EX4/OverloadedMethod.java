package HW18.EX4;

import java.util.Arrays;
import java.util.Scanner;

public class OverloadedMethod {
        public static void overloaded(){
            System.out.println("Я пустой");
        }
        public static void overloaded(String string){
            System.out.println(string);
        }
        public static void overloaded(String[] array){

            System.out.println(array.toString()+" ");
        }
        static int input() {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите число:");
            return input.nextInt();
        }
        static String input1() {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите строку:");
            return input.nextLine();
        }

        static int[] arrayCreate() {
            int[] array = new int[input()];
            for (int i = 0; i < array.length; i++) {
                array[i] = (i * 2) + 1;
                System.out.println(array[i]);
            }
            return Arrays.stream(array).toArray();
        }

        public static void overloaded(int[] array){
            int summ =0;
            for (int x:array) {
                summ=summ+x;
            }
            System.out.println("Сумма елементов: "+summ);
        }
        public static void overloaded(String string, int x){
            System.out.println("Ваше сообщение - \"" +string+"\","+" ваше число - "+ x +","+
                    " где \""+string+"\" и "+ x +" ваши введенные строка и число соответственно.");
        }
        public static void main(String[] args) {
            overloaded(input1(), input());
        }
}
    /*Написать перегруженный метод, который может:
        - не принимать никаких значений, тогда он будет выводить на консоль сообщение типа:
        "Я пустой".
        - Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
        - Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения
        через пробел.
        - Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов
        массива.
        - Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
        "Ваше сообщение - "%%%%%%%%", ваше число -  $",
        где "%%%%%%%%" и $ ваши введенные строка и число соответственно.*/