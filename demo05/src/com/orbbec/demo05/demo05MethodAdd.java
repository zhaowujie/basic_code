package com.orbbec.demo05;

public class demo05MethodAdd {
    public static void main(String[] args) {
        int x = sum(100, 200);
        System.out.println("--------------------");
        sum_p(10, 20);
    }

    public static int sum(int a, int b){
        int result  = a + b;
        return result;
    }

    public static void sum_p(int a, int b){
        int res = a + b;
        System.out.println("两个数的和是：" + res);
    }
}
