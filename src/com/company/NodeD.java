package com.company;

public class NodeD {
    NodeD previous;
    Object value;
    NodeD next;

    public NodeD(Object value,NodeD previous,NodeD next){
        this.value=value;
        this.next=next;
        this.previous=previous;
    }


}

