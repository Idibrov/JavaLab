public class Task3_Main {
    public static void main(String[] args) {
        Object lock = new Object();

        Task3_1 thread1 = new Task3_1(lock);
        Task3_2 thread2 = new Task3_2(lock);

        thread1.start();
        thread2.start();
    }
}
