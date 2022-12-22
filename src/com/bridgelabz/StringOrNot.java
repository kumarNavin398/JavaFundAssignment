package com.bridgelabz.basic;

public class StringOrNot {

    public static void main(String[] args) {

        String style = new String("Rahul");
        String style2 = new String("Rahul");

        if(style.equals(style2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
