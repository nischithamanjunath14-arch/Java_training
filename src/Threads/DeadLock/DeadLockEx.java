package Threads.DeadLock;

public class DeadLockEx {

        public static void main(String[] args) {

            Object Lock1 = new Object();
            Object Lock2 = new Object();

            Thread t1 = new Thread(() -> {
                synchronized (Lock1) {
                    System.out.println("Thread-1 locked obj1");

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }

                    synchronized (Lock2) {
                        System.out.println("Thread-1 locked obj2");
                    }
                }
            });

            Thread t2 = new Thread(() -> {
                synchronized (Lock2) {
                    System.out.println("Thread-2 locked obj2");

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }

                    synchronized (Lock1) {
                        System.out.println("Thread-2 locked obj1");
                    }
                }
            });

            t1.start();
            t2.start();
        }
    }