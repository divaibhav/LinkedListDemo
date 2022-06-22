package com.niit.demo;

public class SinglyLinkedList {
    //head or start
    //tail or end (it is optional)
    private Node head;
    private Node tail;

    //we are using default constructor
    //insert
    // insert at beginning
    public void addNodeAtBeginning(int data){
        //step 1: create new node
        Node node = new Node(data);
        //step 2: check if linked list is empty
        if(isEmpty()){
            head = node;
            tail = node;
        }
        else{
            //new node next will refer to existing linked list, which is referred by head
            node.setNext(head);
            head = node;
        }
    }

    public void addNodeAtTheEnd(int data){
        // step 1:
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
            tail = node;
        }
        else{
            tail.setNext(node);
            tail = node;
        }
    }
    public void addNodeBeforeGivenData(int data,int givenData){
        Node node = new Node(data);
        Node temp = head;
        Node previous = null;
        while (temp != null && temp.getData() != givenData){
            previous = temp;
             temp = temp.getNext();
        }
        if(temp != null){
            if(previous != null){
                node.setNext(previous.getNext());
                //node.setNext(temp);
                previous.setNext(node);
            }
            //given data is first node
            else{
                node.setNext(head);
                head = node;
            }
        }

    }
    public void addNodeAfterGivenData(int data, int givenData){
        //complete this method
    }
    //traversing each node once
    public void traverse(){
        Node temp = head;
        while (temp != null){


            System.out.print(temp.getData() + "--->");
            // update the temp with the next node
            temp = temp.getNext();
        }
    }

    private boolean isEmpty() {
        return head == null;
    }
}
