package com.ExceptionalHandling;

import java.io.IOException;

public class CheckedException {
    static void readFile()throws IOException{
        throw new IOException("File NOT Found");

    }
    static void display()throws IOException{
        readFile();
    }
    public static void main(String[] args) {
        try{
            display();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
