package com.orbbec.demo05;

import javax.xml.ws.soap.Addressing;

/*
* 计算1到100的和，并返回显示
* */
public class DemoADD100 {
    public static void main(String[] args) {
        System.out.println("result is :" + ADD100());
    }

    public static int ADD100(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
