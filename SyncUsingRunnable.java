class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

class MyRunnable implements Runnable {
    Counter counter;

    MyRunnable(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SyncUsingRunnable {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(new MyRunnable(c));
        Thread t2 = new Thread(new MyRunnable(c));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.count); // ✅ Expected: 2000
    }
}
