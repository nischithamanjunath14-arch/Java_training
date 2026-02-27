package com.GarbageCollection.Eligibility.ReassigningReference;

public class Demo {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2= new Demo();

        obj1 =obj2;//1st obj is eligible for garbage collection
    }
}
