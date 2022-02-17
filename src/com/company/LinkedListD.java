package com.company;

public class LinkedListD <T> {
    NodeD head;

    public LinkedListD(){
        head = null;
    }

    public void add(Object value){
        NodeD newnode = new NodeD(value,null,null);

        if (head == null)
            head = newnode;
        else {
            newnode.next = head;
            head.previous = newnode;
            //newnode.previous=null;
            head = newnode;
        }
    }

    public void delete(){
        head = head.next;
        head.previous=null;
    }

    public void display(){
        NodeD nodeD = head;
        while (nodeD!=null){
            System.out.println((T)nodeD.value);
            nodeD = nodeD.next;
        }
    }



}
