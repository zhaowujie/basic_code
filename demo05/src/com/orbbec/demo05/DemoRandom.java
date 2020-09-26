package com.orbbec.demo05;

import java.util.Random;

public class DemoRandom {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt();
        System.out.println("A random number:" + a);
    }

}
