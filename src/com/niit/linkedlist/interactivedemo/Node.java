package com.niit.linkedlist.interactivedemo;

public class Node {
    private Student data;
    private Node next;

    public Node(Student student) {
        this.data = student;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "student=" + data +
                '}';
    }
}
