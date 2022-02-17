package com.company;

public class Stack<T> {
    int size;
    Object[] stack;
    int top;

    public Stack(int size){
        this.size=size;
        stack = new Object[this.size];
        top=-1;
    }

    public void push(int newitem){

        if (isFull()){
            System.out.println("The stack is overflow");
        }

        top =top+1;
        stack[top]= newitem;

       // System.out.println(stack);

    }




    public void   pop  (){

        if (isEmpty()){
            System.out.println("The stack is empty : please try again");
        }

        T item = (T) stack[top];

        top -=1;



    }


    public boolean isFull(){
        return (top == size-1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public int Top(){

        return top;
    }

    public void Display(){
        for (Object stack1 : stack) {
            System.out.println(stack1);
        }
    }


}
