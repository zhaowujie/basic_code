package com.orbbec.day04;

public class helloworld {
    @Override
    public String toString() {
        return "helloworld{}";
    }

    public helloworld() {                           // alt + insert 自动生成方法
    }

    public static void main(String[] args) {            // psvm + enter
        System.out.println("helloworld!!!");            // sout + enter

        print_520(5, 10);
        int s = add(1, 5);
        System.out.println("s的计算结果是："+ s);

    }

    public static void print_520(int rows, int cols){
        for (int i = 0; i < rows; i++) {                   // 5.fori       自动生成 for循环
            for (int i1 = 0; i1 < cols; i1++) {           // 10.fori      自动生成for i1 循环
                System.out.print("8");
            }
            System.out.print('\n');
        }
    }

    public static int add(int a, int b){
        int res = a + b;

        return res;
    }
}
