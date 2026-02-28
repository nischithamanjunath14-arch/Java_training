package Threads.WaysOfCreatingThreads.ThreadClass.E2;



class UsingThreadClass extends Thread {
    @Override
    public void run() {
//        System.out.println("Running....");
        for(int i=0;i<=5;i++)
            System.out.println(i+" Child Thread");
    }
}

public class Demo{
    public static void main(String[] args) {

        UsingThreadClass t1=new UsingThreadClass();
        t1.start();
        for (int i=0;i<=5;i++)
        {
            System.out.println(i+" Main Thread");
        }

    }
}

