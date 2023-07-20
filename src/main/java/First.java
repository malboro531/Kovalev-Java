import java.util.Scanner;

// Составить алгоритм: если введенное число больше 7, то вывести “Привет”
public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число");

        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            if (i > 7) {
                System.out.println("Привет");
            } else System.out.println("Число меньше или равно 7");
        } else System.out.println("Введенные данные не корректны. Попробуйте снова");
        sc.close();
    }
}
