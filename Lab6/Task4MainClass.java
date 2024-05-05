import java.util.Scanner;

public class Task4MainClass {
    int number;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int number = scanner.nextInt();

        Task4SubClass subClass = new Task4SubClass(number);
        subClass.displayNumber();
    }
}
