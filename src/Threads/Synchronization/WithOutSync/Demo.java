package Threads.Synchronization.WithOutSync;
//not thread safe and faster
class counter{
    int count=0;

    void increment(){
    count++;}
}

public class Demo {
    public static void main(String[] args) throws Exception{
        counter c=new counter();
        Thread t1= new Thread(()->{
            for(int i=0;i<1000;i++){
                c.increment();
            }
        });
        Thread t2= new Thread(()->{
            for(int i=0;i<1000;i++){
                c.increment();
            }
        });

t1.start();
t2.start();
t1.join();
t2.join();
        System.out.println("count: " +c.count);
    }
}
