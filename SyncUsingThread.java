class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

class MyThread extends Thread {
    Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SyncUsingThread {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.count); // ✅ Expected: 2000
    }
}
