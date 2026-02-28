package Threads.MainSingleThread;

public class Demo {
    public static void main(String[] args) {//main is a thread
        System.out.println("Main Thread Started!");
        for(int i =0 ;i<5;i++){
            System.out.println("Main Thread: "+i);
        }
        System.out.println("Main Thread Stopped!");
    }
}
