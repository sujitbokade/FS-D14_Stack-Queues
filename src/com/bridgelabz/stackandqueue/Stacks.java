package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.LinkedList;

public class Stacks <T>{
    LinkedList<T> linkedList;
    public Stacks(){
        this.linkedList=new LinkedList<>();
    }

    void push(T data){
        linkedList.push(data);
    }

    void display(){
        linkedList.print();
    }

    void pop(){
        linkedList.pop();
    }
    public T peak(){
        return linkedList.peak();
    }

    public boolean isEmpty(){
        if(linkedList.size() == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Stacks<Integer> stack = new Stacks<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();

        while(!stack.isEmpty()){
            System.out.println(stack.peak());
            stack.pop();
            stack.display();
            System.out.println();
        }
    }
    }

