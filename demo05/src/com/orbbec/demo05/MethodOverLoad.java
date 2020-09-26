package com.orbbec.demo05;

public class MethodOverLoad {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10L, 12L));
    }

    public static int sum(int a, int b) {
        System.out.println("two num method was called");
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        System.out.println("three num method was called");
        return a + b + c;
    }

    public static long sum(long a, long b){
        System.out.println("Two long method was called!");
        return (long)(a + b);
    }
}
