package Threads.WaysOfCreatingThreads.RunnableInterface;


    class MyTask1 implements Runnable {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("My Thread: "+i);
            }
        }
    }
    public class Ex2 {
        public static void main(String[] args) {
           MyTask1 obj = new MyTask1();
            Thread t1 = new Thread(obj);
            Thread t2 = new Thread(obj);
            t1.start();
            t2.start();
            for(int i = 1;i<=5;i++){
                System.out.println("Main Thread: "+i);
            }

        }
    }

