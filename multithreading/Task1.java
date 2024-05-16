public class Task1 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Состояние после запуска: " + this.getState());
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            System.out.println(Thread.currentThread().getName() + ": Состояние во время выполнения: " + this.getState());
            while (System.currentTimeMillis() - startTime < (i + 1) * 10) {
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Task1();
            System.out.println("Поток " + i + ": состояние перед запуском: " + thread.getState());
            thread.start();
        }
    }
}
