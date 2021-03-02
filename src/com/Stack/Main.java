package com.Stack;

import static com.Stack.UseStatic.meth2;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // create stack object
        Stack myStack = new Stack();
        for (int i = 0; i < 11; i++) {
            myStack.push(i);
        }
        for (int i = 0; i < 11; i++) {
            myStack.pop();
        }
        for (int iStack: myStack.stck) {
            System.out.println(iStack);
        }

        // create test object
        Test ob = new Test(15,20);
        System.out.println("Before: a = " + ob.a + " and b = " + ob.b);
        ob.meth(ob);
        System.out.println("After: a = " + ob.a + " and b = " + ob.b);

        // create UseStatic object
        UseStatic.meth2(42);
        System.out.println(UseStatic.b);
    }
}
