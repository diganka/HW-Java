package HW14;

public class EX1 {
    public static void main(String[] args) {

        int a = 7;
        int b = 9;
        a+= b;
        b = a-b;
        a-= b;
        System.out.println("a="+ a +" b="+ b);
    }
}
    /*Coздать две переменные типа int:
        int a = 7;
        int b = 9;
        Поменять между собой значения переменных a и b.
        Создавать новые переменные нельзя.
        Можно применять только арифметические действия к перемнным a и b.
        Вывести в консоль значения переменных a и b после их переопределения.*/