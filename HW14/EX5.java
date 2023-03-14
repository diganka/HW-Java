package HW14;

public class EX5 {
    public static void main(String[] args) {
        String string="Completely random text in English. In it, we just need" +
                "to determine how many times the character 'a' occurs there. " +
                "And we can use the split method and the length method.";
        String [] array = string.toLowerCase().split("a");
        System.out.println(array.length-1);
    }
}

    /*Зная из урока что при применении к массиву строк метода length, можно узнать сколько
        элементов находится в массиве. Попробовать вывести на экран какое количество раз
        символ 'a' встречается в данной строке:
        Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.
        Решить данную задачу с использованием метода split,
        а также с учетом верхнего и нижнего регистра символа 'a'.*/