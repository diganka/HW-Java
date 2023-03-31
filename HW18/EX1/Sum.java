package HW18.EX1;

public class Sum {
    public static int getSum ( int num1, int num2){
        return num1 + num2;
    }
    public static void getSum2 ( int num1, int num2){

        System.out.println(num1 + num2);
    }
    public static void main(String[] args) {
        System.out.println(getSum(95,3));
        getSum2(14,8);
    }
}
   /* Написать метод, принимающий в качестве параметров два числа,
        который будет выводить на консоль сумму этих двух чисел.
        Написать второй метод, который будет возвращать сумму двух чисел,
        которые он будет принимать в параметре метода.
        Вывести на консоль сумму двух любых чисел при помощи первого и второго метода.*/