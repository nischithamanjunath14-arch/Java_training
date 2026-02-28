package com.Strings;

public class StringOpertaionsDemo {
   public  static void main(String[] args) {
       String s1 = "Peppa Pig";
       String s2 = new String("Peppa Pig");
       System.out.println(s1);
       System.out.println(s2);
       System.out.println("Length of s1 is: "+s1.length());
       System.out.println("Chart at 2 is: "+s1.charAt(2));
       System.out.println("Upper case of string s1 is: "+s1.toUpperCase());
       System.out.println("Lower case of string s1 is: "+s1.toLowerCase());
       System.out.println("s1 is equal to s2: "+s1.equals(s2));
       System.out.println("s1 == to s2: "+s1==s2);
       System.out.println("S1 compare to s2 :"+s1.compareTo(s2));
       System.out.println("Substring of s1 is: "+s1.substring(6,9));
       System.out.println("s1 Contains pig : "+s1.contains("Pig"));
       System.out.println("Index of a in s1 is: "+s1.indexOf("a"));
       System.out.println("replace peppa with mummy : "+s1.replace("Peppa","Mummy"));
       System.out.println("Peppa starts with Pep: "+s2.startsWith("Pep"));
       System.out.println("Peppa ends with Pep: "+s2.endsWith("Pig"));
       String s3 = "      suzie     ";
       System.out.println("Before trim: "+s3);
       System.out.println("After trim: "+s3.trim());
       System.out.println("Concate : "+s1.concat(" NEW Episodes"));
       String s4="";
       System.out.println("Is s4 Empty: "+ s4.isEmpty());
       String sentence= "Suzie ,is ,Peppa's  ,bestfriend";
       String[] arr= sentence.split("," );
       for(String i : arr){
           System.out.print("  "+i);
       }




   }
}
