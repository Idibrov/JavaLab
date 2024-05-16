public class Task3_2 extends Thread {
    private final Object lock;

    public Task3_2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (lock) {
                System.out.println("Поток 2");
                lock.notify();
                try {
                    if (i < 4) {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
