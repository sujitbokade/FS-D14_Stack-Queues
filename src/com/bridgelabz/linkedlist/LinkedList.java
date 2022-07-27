package com.bridgelabz.linkedlist;

public class LinkedList <T>{
    Node<T>head;
    Node<T>tail;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    void print(){
        Node<T> temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public void insert(T data) {
        Node<T> newNode=new Node<>(data);
        head.next=newNode;
        newNode.next=tail;

    }

    public void pop() {
        T deleteElement= head.data;
        head=head.next;
    }

    public void popLast() {
        Node<T>temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        temp=tail;
    }
    public Node<T> searchElement(T search) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(search))
                return temp;
            temp=temp.next;
        }
        return null;
    }
}
