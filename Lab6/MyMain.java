import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Задание 1");

        Client client = new Client("Иван", "Иванов", "Сбербанк");
        System.out.println("Информация о клиенте:");
        client.displayInfo();
        System.out.println();


        BankEmployee employee = new BankEmployee("Петя", "Петров", "Сбербанк");
        System.out.println("Информация о сотруднике:");
        employee.displayInfo();
        System.out.println();

        System.out.println();
        System.out.println("Задание 3");

        System.out.println("Введите данные грузовика:");
        System.out.print("Вес: ");
        int weight = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Модель: ");
        String model = scanner.nextLine();
        System.out.print("Цвет: ");
        char color = scanner.nextLine().charAt(0);
        System.out.print("Скорость: ");
        float speed = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Количество колес: ");
        int numberOfWheels = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Максимальный вес: ");
        float maxWeight = scanner.nextFloat();
        scanner.nextLine();

        Truck truck = new Truck(weight, model, color, speed, numberOfWheels, maxWeight);
        System.out.println("Информация о грузовике:");
        truck.outPut();
        System.out.println("Максимальный вес: " + truck.maxWeight);
        truck.newWheels(12);

        System.out.println();
        System.out.println("Задание 4");

        System.out.println("Введите целое число для задания 4:");
        int number = scanner.nextInt();
        Task4SubClass subClass = new Task4SubClass(number);
        subClass.displayNumber();


        System.out.println();
        System.out.println("Задание 5");

        System.out.println("Введите возраст пользователя для задания 5:");
        int age = scanner.nextInt();
        Task5ChildClass child = new Task5ChildClass(age);
        child.getUserName();
    }
}
