package com.company;

public class MainD {
    public static void main(String[] args) {

        LinkedListD<String> linkedListD = new LinkedListD <String>();
        linkedListD.add("Anas");
        linkedListD.add("Rachid");
        linkedListD.add("Bilal");
        linkedListD.display();

        System.out.println("   \n");

        linkedListD.delete();
        linkedListD.display();




    }
}
