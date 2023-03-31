package HW19.EX4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("START калькулятор запущен");
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Введите действие: ");
            String input = in.nextLine();
            if (input.equalsIgnoreCase("Stop")) {
                System.out.println("Калькулятор закрыт");
                break;
            }
            try {
                double result = evaluate(input);
                System.out.println(result);
            } catch (IllegalArgumentException e) {
                System.out.println("Введите корректное действие: ");
            }
        }
    }

    public static double evaluate(String input) {
        String[] string = input.split(" ");
        if (string.length != 3) {
            throw new IllegalArgumentException();
        }
        double number1 = Double.parseDouble(string [0]);
        double number2 = Double.parseDouble(string [2]);
        switch (string [1]) {
            case "+":
                return number1+number2;
            case "-":
                return number1-number2;
            case "*":
                return number1*number2;
            case "/":
                return number1/number2;
            default:
                throw new IllegalArgumentException();
        }
    }
}
   /* Создать класс калькулятор.
        В нем создать методы:
        summ, minus, multiply, division.
        Сложение, вычитание, умножение и деление соответственно.
        Каждый метод принимает в качестве параметров два значения типа double.
        И выводит в консоль результат действия.
        Также в классе есть метод старт. Который выводит сообщение в консоль, что
        калькулятор запущен. И предлагает ввести действие в вашей консоли.
        Калькулятор должен принимать только следующие типы действий:
        2+4;    - пример синтаксиса сложения;
        5-6;    - пример синтаксиса вычитания;
        25*3;   - пример синтаксиса умножения;
        34/3;   - пример синтаксиса деления;
        После ввода действия на консоль выводится ответ этого действия.
        И после снова выводится сообщение о предложении ввести действие.
        в случае ввода другого синтаксисана консоль возвращается сообщение:
        "Введите корректное действие".
        И после снова выводится сообщение о предложении ввести действие.
        Программа закрывается после ввода команды Stop.
        Перед закрытием на консоль должно выводится сообщение:
        "Калькулятор закрыт". */
