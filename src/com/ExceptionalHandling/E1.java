package com.ExceptionalHandling;

public class E1 {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j = 0;
        try {
            k = i / j;
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[10]);
      }catch(ArithmeticException e){
            System.out.println("can't be divided");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        }catch(Exception e){//when the exception is unknown
            System.out.println("Unknown exception");
        }finally{
            System.out.println("This is will get executed no matter what.");
        }
    }static{//this will get executed first even before main function.
        //not part of exception handling
        System.out.println("Exception started");
    }
}
