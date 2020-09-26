package com.orbbec.demo05;

import java.util.Scanner;

public class DemoAnonymous {
    public static void main(String[] args) {
        // Standard:
        Scanner sc0  = new Scanner(System.in);
        method(sc0);
        // Anonymous:
        method(new Scanner(System.in));

        // Anonymous:
        Scanner sc = methodreturn();
        String str = sc.next();
        System.out.println("input string is " + str);
    }

    public static void method(Scanner sc){
        int a = sc.nextInt();
        System.out.println("input is:" + a);
    }

    public static Scanner methodreturn(){
        return new Scanner(System.in);
    }
}
