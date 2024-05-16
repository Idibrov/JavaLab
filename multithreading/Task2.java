public class Task2 extends Thread {
    private Counter counter;

    public Task2(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    synchronized (counter) {
                        counter.increment();
                        System.out.println("Поток " + Thread.currentThread().getId() + ": count = " + counter.getCount());
                    }
                }
                synchronized (counter) {
                    counter.notify();
                }
            }).start();
        }

        synchronized (counter) {
            while (counter.getCount() < 100 * 1000) {
                try {
                    counter.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Значение count: " + counter.getCount());
    }
}