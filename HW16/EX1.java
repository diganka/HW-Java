package HW16;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите программу, которая Вам интересна?");
        String string = input.nextLine();

        switch (string.toLowerCase()) {
            case ("intellij idea"):
                System.out.println("Введите тип ОС:");
                String string2 = input.nextLine();
                switch (string2.toLowerCase()) {
                    case ("linux"):
                        System.out.println("https://www.jetbrains.com/idea/download/#section=linux");
                        break;
                          case ("macos"):
                            System.out.println("https://www.jetbrains.com/idea/download/#section=mac");
                              break;
                                case ("windows"):
                                  System.out.println("https://www.jetbrains.com/idea/download/#section=windows");
                                   break;
                    default:
                        System.out.println("Данный тип ОС не существует");
                }
                break;
               case ("git"):
                   System.out.println("Введите тип ОС:");
                     String string3 = input.nextLine();
                       switch (string3.toLowerCase()) {
                         case ("linux"):
                           System.out.println("https://git-scm.com/download/linux");
                             break;
                               case ("macos"):
                                 System.out.println("https://git-scm.com/download/mac");
                                   break;
                                    case ("windows"):
                                      System.out.println("https://git-scm.com/download/win");
                                       break;
                    default:
                        System.out.println("Данный тип ОС не существует");
                }
                break;
            case ("java"):
                System.out.println("Введите тип ОС:");
                  String string4 = input.nextLine();
                    switch (string4.toLowerCase()) {
                       case ("linux"):
                         System.out.println("https://www.oracle.com/java/technologies/downloads/#java11-linux");
                           break;
                             case ("macos"):
                               System.out.println("hhttps://www.oracle.com/java/technologies/downloads/#java11-mac");
                                 break;
                                   case ("windows"):
                                    System.out.println("https://www.oracle.com/java/technologies/downloads/#java11-windows");
                                      break;
                    default:
                        System.out.println("Данный тип ОС не существует");
                }
                break;
            default:
                System.out.println("Данный тип программы не существует");
        }
    }
}
   /* Используя оператор switch написать программу, которая выводит на
        консоль ссылку для скачивания программы.
        Из выбора программ взять: IntelliJ IDEA, Git, Java.
        Из выбора ОС взять: Linux, macOS, Windows.
        Программа должна спросить пользователя какая программа ему интересна,
        также спросить какую ОС он использует, а после вывести в консоль необходимую ссылку.
        Если программа с таким названием не существует выводит сообщение в консоль, о том
        что такой программы не существует.
        Если указанной пользователем ОС нет, то выводится сообщение в консоль, о том
        что такой ОС не существует.*/
