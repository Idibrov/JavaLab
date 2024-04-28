import java.util.Scanner;

public class Task5MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст пользователя:");
        int age = scanner.nextInt();
        Task5ChildClass child = new Task5ChildClass(age);
        child.getUserName();
    }
}
