package com.GarbageCollection.Eligibility.ObejctCreatedInsideMethod;

 class Demo {
  static  void createObject() {
        Demo obj = new Demo();//After the method execution is over this object in the heap will get eligible for gc
    }

    public static void main(String[] args) {
        createObject();
    }
}