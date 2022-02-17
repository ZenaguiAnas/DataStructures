package com.company;

public class QueueArray <T>{
    Object[] Queue;
    int Size;
    int Front;
    int Rear;

    public QueueArray(int Size){
        this.Size = Size;
        Queue = new Object[Size];
        Front = -1;
        Rear = -1;
    }

    public Boolean isFull(){
        return (Rear == Size-1);
    }

    public Boolean isEmpty(){
        return (Front == -1 || Front>Rear);
    }

    public void queue(Object element){
        if (isFull()) return;
        Rear=Rear+1;
        Queue[Rear] = element;

        Front =0;

    }

    public T Dequeue (){
        if (isEmpty()) return null;
        T item =(T) Queue[Front];
        Front +=1;
        return item;
    }


    }

