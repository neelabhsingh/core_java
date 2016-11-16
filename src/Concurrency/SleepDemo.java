package Concurrency;

/**
 * Created by neelabhsingh on 03/11/16.
 */
public class SleepDemo {

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("Sleeping ....");
                    Thread.sleep(10000);
                    System.out.println("Done sleeping, No interrupt");
                } catch (InterruptedException e) {
                    System.out.println("I was interrupted");
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        t1.interrupt();// Main thread interrupts t, so the Thread.sleep() call
        // inside t's run() method will throw an InterruptedException!
    }
}
