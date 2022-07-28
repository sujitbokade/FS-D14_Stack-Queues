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
    public Node<T> searchElement(T searchData) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(searchData))
                return temp;
            temp=temp.next;
        }
        return null;
    }
    public boolean insertAfter(T searchData, T insertData){
        Node<T> newNode = new Node<>(insertData);
        Node<T> searchNode = searchElement(searchData);
        if(searchNode!=null){
            newNode.next=searchNode.next;
            searchNode.next=newNode;
            return true;
        }
        return false;
    }

    public void deleteElement(T data){
        Node<T> searchNode=searchElement(data);
        Node<T> temp=head;
        while(temp.next!=searchNode){
            temp=temp.next;
        }
        temp.next=searchNode.next;
    }
    public void print(){
        Node<T> temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public int size() {
        int count=0;
        Node<T>temp=head;
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    public  T peak(){
        return head.data;
    }


}



