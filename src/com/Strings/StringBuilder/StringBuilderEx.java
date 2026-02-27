package com.Strings.StringBuilder;

public class StringBuilderEx {
    public void StringAppend() {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Before append " + sb);
        sb.append("World");
        System.out.println("After append " + sb);
    }

    public void StringInsert() {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Before inserting " + sb);
        sb.insert(4, "ooo");
        System.out.println("After inserting " + sb);
    }

    public void StringReverse() {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Before reversing " + sb);
        sb.reverse();
        System.out.println("After reversing" + sb);
    }

}
class Driver{
    public static void main(String[] args) {
        StringBuilderEx obj = new StringBuilderEx();
        obj.StringAppend();
        obj.StringInsert();
        obj.StringReverse();

    }
}












