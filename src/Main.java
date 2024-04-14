import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1)");
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        double result1 = (46 + 10) * (10.0 / 3);
        int result2 = 29 * 4 * (-15);
        System.out.println("2)");
        System.out.println("Результат выражения 1: " + result1);
        System.out.println("Результат выражения 2: " + result2);

        int number = 10500;
        double result3 = (number / 10.0) / 10;
        System.out.println("3) Результат выражения 3: " + result3);

        double num1 = 3.6, num2 = 4.1, num3 = 5.9;
        double product = num1 * num2 * num3;
        System.out.println("4) Произведение чисел: " + product);

        Scanner scanner = new Scanner(System.in);
        System.out.println("5) Введите целые числа (для завершения введите любой не целый символ):");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int inputNumber = scanner.nextInt();
                System.out.println(inputNumber);
            } else {
                String input = scanner.next();
                break;
            }
        }

        System.out.println("6) Введите целое число b:");
        int b;
        b = scanner.nextInt();
        if (b % 2 == 0) {
            System.out.println("Четное");
            if (b > 100) {
                System.out.println("Выход за пределы диапазона");
            }
        } else {
            System.out.println("Нечетное");
        }
    }
}

