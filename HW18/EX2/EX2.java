package HW18.EX2;

public class EX2 {

    public static void printEvenNumbers(int[] ints) {
        for (int num : ints) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void printOddNumbers(int[] ints) {
        for (int num : ints) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
 public static void main(String[] args) {
     int[] x = {1054, 2, 73, 4, 15, 6, 7, 45, 78, 2, 9};

     System.out.println("Четные числа:");
     printEvenNumbers(x);

     System.out.println("Нечетные числа:");
     printOddNumbers(x);
 }
}
   /* Написать метод, принимающий в качестве параметра массив целых чисел. И выводит на экран все четные числа списком,
        а также нечетные числа списком.*/
