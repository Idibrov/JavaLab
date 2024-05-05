public class Task4SubClass extends Task4MainClass {
    public Task4SubClass(int number) {
        this.number = number;
    }

    void displayNumber() {
        System.out.println("Полученное число из главного класса: " + number);
    }
}
