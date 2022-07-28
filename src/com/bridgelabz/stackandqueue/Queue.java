package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.LinkedList;

public class Queue<T> {
    LinkedList<T> linkedList;

    public Queue() {
        this.linkedList = new LinkedList<>();
    }

    public void enqueu(T key) {
        linkedList.add(key);
    }
    public void display() {
        linkedList.print();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueu(56);
        queue.enqueu(30);
        queue.enqueu(70);
        queue.display();
    }
}

