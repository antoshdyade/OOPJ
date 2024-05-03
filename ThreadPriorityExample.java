public class ThreadPriorityExample {

    public static void main(String[] args) {
        // Create threads with different priorities
        Thread highPriorityThread = new Thread(new MyRunnable(), "HighPriorityThread");
        Thread normalPriorityThread = new Thread(new MyRunnable(), "NormalPriorityThread");
        Thread lowPriorityThread = new Thread(new MyRunnable(), "LowPriorityThread");

        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        // Start threads
        highPriorityThread.start();
        normalPriorityThread.start();
        lowPriorityThread.start();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " is running. Priority: "
                        + Thread.currentThread().getPriority() + ", Count: " + i);
                // Yield to allow other threads with the same or higher priority to run
                Thread.yield();
            }
        }
    }
}
