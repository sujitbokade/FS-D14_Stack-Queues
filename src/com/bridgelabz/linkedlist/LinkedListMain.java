package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
           LinkedList<Integer> linkedList1=new LinkedList<>();
           linkedList1.add(56);
           linkedList1.add(30);
           linkedList1.add(70);
           linkedList1.print();

           linkedList1.popLast();
           linkedList1.print();

           if(linkedList1.searchElement(30)!=null){
               System.out.println("Element Found Successfully!");
           }else {
               System.out.println("Element Not Found!");
           }

    }
}
