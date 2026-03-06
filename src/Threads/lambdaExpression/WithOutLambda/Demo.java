package Threads.lambdaExpression.WithOutLambda;
interface greeting{
    void sayHello();

}
public class Demo {
    public static void main(String[] args) {
        greeting g = new greeting(){
            @Override
            public void sayHello(){
                System.out.println("Hello World");

            }
        };
        g.sayHello();

    }
}
