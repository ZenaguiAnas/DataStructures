package com.company;

public class StackLinkedList<T> {
   NodeLs top;

   public StackLinkedList(){
       top=null;
   }

   public void push(Object element){
       NodeLs newn = new NodeLs(element,null);

       newn.data = element;
       newn.next = top;
       top = newn;

   }

   public void display(){
       NodeLs temp;
       temp = top;

       if (top == null){

       } else {
           while (temp != null){
               System.out.println(temp.data);
               temp = temp.next;
           }
       }
   }

   public T pop(){
       T item =(T) top.data;
       top=top.next;
       return item;
   }




}
