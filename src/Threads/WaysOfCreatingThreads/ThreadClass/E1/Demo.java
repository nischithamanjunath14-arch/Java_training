package Threads.WaysOfCreatingThreads.ThreadClass.E1;

class MyThread extends Thread{            //thread 1
    public void run(){//here public because run is implemented from runnable interface with is abstract so public
        System.out.println("Thread is running");
    }
}
public class Demo {                 //thread 2
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

    }

}


//public class UsingThreadClass extends Thread {
//    @Override
//    public void run() {
//        System.out.println("Running....");
//        for(int i=0;i<10;i++)
//            System.out.println(i+" Child Thread");
//    }
//}
//
//class MultithreadDemo{
//    public static void main(String[] args) {
//
//        UsingThreadClass t1=new UsingThreadClass();
//        t1.start();
//        for (int j=10;j>0;j--)
//        {
//            System.out.println(j+" Main Thread");
//        }
//
//    }
//}