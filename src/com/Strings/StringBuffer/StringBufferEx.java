package com.Strings.StringBuffer;

import com.Strings.StringBuilder.StringBuilderEx;

public class StringBufferEx {
    public void StringAppend() {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Before append " + sb);
        sb.append("World");
        System.out.println("After append " + sb);
    }

    public void StringInsert() {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Before inserting " + sb);
        sb.insert(4, "ooo");
        System.out.println("After inserting " + sb);
    }

    public void StringReverse() {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Before reversing " + sb);
        sb.reverse();
        System.out.println("After reversing" + sb);
    }

}






class Driver{

    public static void main(String[] args) {
        StringBufferEx obj = new StringBufferEx();
        obj.StringAppend();
        obj.StringInsert();
        obj.StringReverse();

    }
}


