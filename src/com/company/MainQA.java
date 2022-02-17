package com.company;

public class MainQA {
    public static void main(String[] args) {

        QueueArray <String> qa = new QueueArray <String>(3);
        qa.queue("A");
        qa.queue("B");
        qa.queue("C");


        System.out.println(qa.Dequeue());
        System.out.println(qa.Dequeue());



    }
}