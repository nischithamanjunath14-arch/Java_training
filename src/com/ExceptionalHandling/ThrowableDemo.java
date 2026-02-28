package com.ExceptionalHandling;

public class ThrowableDemo {
    static void Function() throws Throwable{
        throw new Throwable("Something went wrong");
    }
    public static void main(String[] args) {
        try{
            Function();
        }catch(Throwable t){
            System.out.println(t.getMessage());
        }


    }
}
