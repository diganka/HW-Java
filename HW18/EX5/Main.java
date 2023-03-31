package HW18.EX5;

public class Main {

        public static void main(String[] args) {
            Notebook notebook = new Notebook();
            notebook.setSubject("Объектно-ориентированное программирование");
            notebook.setStudent("Турек Диана Владимировна");
            notebook.setQuantityOfPage(48);
            notebook.setYearOfIssue(2023);
            notebook.setColor("Фиолетовый");
            notebook.setUniversity("Национальный авиационный университет");

            System.out.println("Название предмета: " + notebook.getSubject());
            System.out.println("ФИО студента: " + notebook.getStudent());
            System.out.println("Количество страниц: " + notebook.getQuantityOfPage());
            System.out.println("Год выпуска: " + notebook.getYearOfIssue());
            System.out.println("Цвет обложки: " + notebook.getColor());
            System.out.println("Название заведения: " + notebook.getUniversity());
        }
}
    /*Создать класс Конспект. Класс должен содержать следующие поля:
        название предмета;
        ФИО студента;
        количество страниц;
        год выпуска;
        цвет обложки.
        Название заведения, где учится студент;
        Создайте публичные методы для получения доступа к полям класса,
        а также методы для присваивания значений полям класса.*/