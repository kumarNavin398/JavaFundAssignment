package com.bridgelabz.basic;

public class countthenegativeint {
    public static void main(String[] args){
        int count=0, sum = 0;
        try{
            int a = Integer.parseInt(args[0]);
            sum+=a;
        } catch (NumberFormatException e){
            count ++;
            throw new RuntimeException(e);
        }
        String str1 = args[1];
        System.out.println("a"+a);
        System.out.println("str1; "+str1);
    }
}
