package com.ExceptionalHandling;

public class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);

    }

}
class Driver{
    static void vote(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be over 18");
        }
        System.out.println("You can vote!");

    }
   // public static void main(String[] args)throws InvalidAgeException {
    //    vote(19);
   public static void main(String[] args)throws InvalidAgeException {
        try{
            vote(18);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
   }
}