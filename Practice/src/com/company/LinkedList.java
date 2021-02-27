package com.company;

public class LinkedList<Item> {
    public  Node head = null;
    public  Node tail = null;

    public void printList(){
        LinkedList.Node n = head;
        while(n!= null){
            System.out.println(n.item + " ");
            n = n.next;
        }
    }
    private class Node{
         Item item;
         Node next;

         public Node(Item item){
             this.item = item;
         }


    }
    public void addToFront(Item data) {

        Node newNode = new Node(data);
           /* if(head == null){
                head = newNode;
            }*/
        newNode.next = head;
        head = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }
    public void addToBack(Item data){
            Node newNode = new Node(data);
            if(tail == null){
                head = newNode;
            }
            tail.next = newNode;
            tail = newNode;
    }





    }

