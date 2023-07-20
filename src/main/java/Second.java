import java.util.Scanner;

//Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет,
// то вывести "Нет такого имени"
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = sc.nextLine();

        if (name.equalsIgnoreCase("вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else System.out.println("Нет такого имени");
        sc.close();
    }
}