public class Task2 extends Thread {
    private Counter counter;

    public Task2(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                    System.out.println("Поток " + Thread.currentThread().getId() + ": count = " + counter.getCount());
                }
            });
            System.out.println("Запуск потока " + thread.getId());
            thread.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Значение count: " + counter.getCount());
    }
}
