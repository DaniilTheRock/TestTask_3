import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < length; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < length; i++) {
            if (array[i] % 3 == 0) {
                if (!found) {
                    System.out.println("Элементы массива, кратные 3:");
                    found = true;
                }
                System.out.println(array[i]);
            }
        }

        if (!found) {
            System.out.println("Нет элементов, кратных 3.");
        }
    }
}
