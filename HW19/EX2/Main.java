package HW19.EX2;

    public class Main {
        public static void main(String[] args) {
            Tree tree1 = new Tree("береза", 150);
            tree1.getInfo();
            Tree tree2 = new Tree(200, 64, "Зеленый");
            tree2.getInfo();
            Tree tree3 = new Tree();
            tree3.getInfo();
            Tree tree4 = new Tree("клен");
            tree4.getInfo();
        }
    }
       /* Создать класс Tree с перегруженными конструкторами.
        В классе есть Tree есть поля:
        String type; int height, int coutOfsticks, String colour;
        Конструктор1 принимающий в параметры String type; int height
        и присваивающий значение полям coutOfsticks значение 13,
        colour "Зеленый".
        Конструктор2 принимающий в параметры int height, int coutOfsticks,
        String colour и присваивающий значение полю type "пихта".
        Констуктор по умолчанию 3, который присваивает height = 350, coutOfsticks = 29,
        сolour = "Желтый".
        Конструктор4 который принимает в параметры String type,
        и вызывает внутри себя конструктор 3.
        Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.
*/