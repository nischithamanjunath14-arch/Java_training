package Threads.ThreadJoin.Ex1;

class MyTask implements Runnable{
   public void run(){
       for(int i =0;i<=5;i++){
           System.out.println("Child: "+i);
       }


    }
}
public class Demo1 {
    public static void main(String[] args)throws InterruptedException {
        MyTask obj = new MyTask();
        Thread t1= new Thread(obj);
        Thread t2= new Thread(obj);
        t1.start();
        t1.join();
        System.out.println("Thread 1 executed ");
        t2.start();
        t2.join();
        System.out.println("Thread 2 executed ");

    }
}
