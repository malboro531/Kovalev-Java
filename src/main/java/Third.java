// Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
public class Third {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 21};

        for (int num : nums) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}