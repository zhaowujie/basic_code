package com.orbbec.demo05;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the first number:");
        int a = sc.nextInt();
        System.out.println("please input the second number:");
        int b = (int)sc.nextFloat();
        System.out.println("Please input the third number:");
        int c = sc.nextInt();
        int temp;
        temp = a > b? a: b;
        temp = temp > c ? temp: c;

        System.out.println("The max number is:" + temp);
        System.out.println("Please input a string:");
        String sentence = sc.next();
        System.out.println("You're right, " + sentence);



    }
}
