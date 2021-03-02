package com.Stack;

public class UseStatic {
    static int a = 3;
    static int b;

    static void meth2(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println("Static is initialized");
        b = a * 3;
    }
}
