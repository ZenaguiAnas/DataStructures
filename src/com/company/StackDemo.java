package com.company;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack <Integer>(3);
        integerStack.push(45);
        integerStack.push(74);
        integerStack.push(82);

        //integerStack.Display();

        //System.out.println(integerStack.pop());

        integerStack.pop();
        integerStack.Display();








    }
}
