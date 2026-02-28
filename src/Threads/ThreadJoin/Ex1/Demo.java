package Threads.ThreadJoin.Ex1;

class MyThread extends Thread{
    public void run(){
        for(int i =0;i<=5;i++){
            System.out.println("Child: "+i);
        }
    }
}
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        t1.join();
        System.out.println("Main thread finished");
    }
}
