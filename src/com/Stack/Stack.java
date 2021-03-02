package com.Stack;

public class Stack {
    int[] stck = new int[10];

    int topOfStack;
    Stack(){
        topOfStack = -1;
    }

    void push (int item){
        if (topOfStack == 9)
            System.out.println("Stack is full");
        else
            stck[++topOfStack] = item;
    }

    int pop (){
        if (topOfStack < 0){
            System.out.println("Stack is underflow");
            return 0;
        }
        else
            return stck[topOfStack--];
    }
}
