import java.util.Scanner;

public class PartOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        System.out.println("Нечетные числа от 1 до 99:");
        for (int i = 1; i <= 99; i += 2) {
            System.out.println(i);
        }
        System.out.println();

        // 2
        System.out.println("Делится на 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Делится на 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Делится на 3 и на 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        // 3
        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите третье число:");
        int num3 = scanner.nextInt();
        scanner.nextLine();

        boolean result1 = num1 + num2 == num3;
        System.out.println("Результат: " + result1);
        System.out.println();

        // 4
        System.out.println("Введите первое число:");
        num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите второе число:");
        num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите третье число:");
        num3 = scanner.nextInt();
        scanner.nextLine();

        boolean result2 = num2 > num1 && num3 > num2;
        System.out.println("Результат: " + result2);
        System.out.println();

        // 5
        System.out.println("Введите элементы массива через пробел:");
        String input1 = scanner.nextLine();
        String[] parts = input1.split(" ");
        int[] array = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            array[i] = Integer.parseInt(parts[i]);
        }
        System.out.println("Массив: " + java.util.Arrays.toString(array));

        boolean result3 = (array[0] == 3 || array[array.length - 1] == 3) && array.length >= 2;
        System.out.println("Результат: " + result3);
        System.out.println();

        // 6
        System.out.println("Введите элементы массива через пробел:");
        String input2 = scanner.nextLine();
        String[] parts2 = input2.split(" ");
        int[] array2 = new int[parts2.length];
        for (int i = 0; i < parts2.length; i++) {
            array2[i] = Integer.parseInt(parts2[i]);
        }
        System.out.println("Массив: " + java.util.Arrays.toString(array2));

        boolean result4 = false;
        for (int num : array2) {
            if (num == 1 || num == 3) {
                result4 = true;
                break;
            }
        }
        System.out.println("Результат: " + result4);
        System.out.println();
    }
}
