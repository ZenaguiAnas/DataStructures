package com.company;

public class MainSL {
    public static void main(String[] args) {
        StackLinkedList<Integer> sl = new StackLinkedList<Integer>();
        sl.push(5);
        sl.push(85);
        sl.push(4);
        sl.display();
        System.out.println("\n");
        sl.pop();
        sl.display();




    }



}
