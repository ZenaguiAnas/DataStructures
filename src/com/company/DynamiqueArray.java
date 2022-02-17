package com.company;


import javax.xml.crypto.Data;
import java.util.Arrays;

public class DynamiqueArray {
    int size;
    int[] data;
    DynamiqueArray next;




    public DynamiqueArray ( ){
        this.next = next;
        int size =1;
        data = new int[size];

    }

    public int get(){
        int size = data.length;
        return size;
    }

    public int getElement(int Index){
        return data[Index];
    }

    public void add(int element){

            ensureCpacity(size+1);
            data[size++] = element;

        }




    public void ensureCpacity(int minCapacity){
        int oldcapacity = data.length;
        if (oldcapacity<minCapacity){
            int newcapacity = oldcapacity*2;
            data = Arrays.copyOf(data,newcapacity);

            if (minCapacity>newcapacity){
                newcapacity = minCapacity;
        }

        }
    }






    }




