package com.yuc.test;

public class Factorial {
    public static int factorial (int n){
        System.out.println(n);
        if(n==1)
        return n;
        else return factorial(n-1);
    }

    public static void main(String[] args) {
        factorial(10);
    }

    public static int ss(int n){
        return factorial(n-1);
    }
}
