import java.util.Scanner;

//Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет,
// то вывести "Нет такого имени"
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name;

        if (sc.hasNext()) {
            name = sc.next();
            if (name.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
            } else System.out.println("Посторонним вход воспрещен");
        }
    }
}
