import java.util.Scanner;

// Составить алгоритм: если введенное число больше 7, то вывести “Привет”
public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число");
        int i;

        if (sc.hasNextInt()) {
            i = sc.nextInt();
            if (i > 7) {
                System.out.println("Привет");
            } else System.out.println("Число меньше или равно 7");
        } else System.out.println("Введенные данные не корректны");
    }
}
