public class Task2_Main {
    public static void main(String[] args) throws InterruptedException {
        Task2 task = new Task2(new Counter());
        task.start();
        task.join();
    }
}
