package HW14;

public class EX4 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        String word1 = "Testing";
        String word2 = "is";
        String word3 = "my";
        String word4 = "favourite";
        String word5 = "job";
        int length = word1.length();
        int length1 = word2.length();
        int length2 = word3.length();
        int length3 = word4.length();
        int length4 = word5.length();
        boolean result = (length>length1)&&(length>length2)&&(length>length3)&&(length>length4);
        System.out.println("Слово1 = "+ word1+ ", Длина этого слова = "+ length);
        System.out.println("Слово2 = "+ word2+ ", Длина этого слова = "+ length1);
        System.out.println("Слово3 = "+ word3+ ", Длина этого слова = "+ length2);
        System.out.println("Слово4 = "+ word4+ ", Длина этого слова = "+ length3);
        System.out.println("Слово5 = "+ word5+ ", Длина этого слова = "+ length4);
        System.out.println(result);
    }
}
   /* Создать строку string = "Testing, is my favourite job"
        Вывести на экран отдельно каждое слово и длину этого слова в след виде:
        Cлово1 = (значение слова), Длина этого слова = (значение длины слова).
        Cлово2 = (значение слова), Длина этого слова = (значение длины слова).
        и т.д.
        Вывести на консоль true, если первое слово длиннее остальных, в
        противном случае вывести false.*/

