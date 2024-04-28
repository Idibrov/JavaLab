import java.util.Scanner;

public class PartOne {
    Scanner scanner = new Scanner(System.in);
    // 1
    public void printOddNumbers() {
        System.out.println("Нечетные числа от 1 до 99:");
        for (int i = 1; i <= 99; i += 2) {
            System.out.println(i);
        }
        System.out.println();
    }
    // 2
    public void printDivisibleByThree() {
        System.out.println("Делится на 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public void printDivisibleByFive() {
        System.out.println("Делится на 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public void printDivisibleByThreeAndFive() {
        System.out.println("Делится на 3 и на 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
    // 3
    public void checkSumOfThreeIntegers() {
        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите третье число:");
        int num3 = scanner.nextInt();
        scanner.nextLine();

        boolean result = num1 + num2 == num3;
        System.out.println("Результат: " + result);
        System.out.println();
    }
    // 4
    public void checkIncreasingSequence() {
        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите третье число:");
        int num3 = scanner.nextInt();
        scanner.nextLine();

        boolean result = num2 > num1 && num3 > num2;
        System.out.println("Результат: " + result);
        System.out.println();
    }
    // 5
    public void checkFirstOrLastElement() {
        System.out.println("Введите элементы массива через пробел:");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int[] array = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            array[i] = Integer.parseInt(parts[i]);
        }
        System.out.println("Массив: " + java.util.Arrays.toString(array));

        boolean result = array[0] == 3 || array[array.length - 1] == 3;
        System.out.println("Результат: " + result);
        System.out.println();
    }
    // 6
    public void checkContainsOneOrThree() {
        System.out.println("Введите элементы массива через пробел:");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int[] array = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            array[i] = Integer.parseInt(parts[i]);
        }
        System.out.println("Массив: " + java.util.Arrays.toString(array));

        boolean result = false;
        for (int num : array) {
            if (num == 1 || num == 3) {
                result = true;
                break;
            }
        }
        System.out.println("Результат: " + result);
        System.out.println();
    }
}
