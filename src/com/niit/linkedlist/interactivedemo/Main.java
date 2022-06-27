package com.niit.linkedlist.interactivedemo;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList =
                new SinglyLinkedList();
        Student s1 = new Student(11, "Vaibhav");
        Student s2 = new Student(12, "Ramesh");
        Student s3 = new Student(6, "Suresh");
        singlyLinkedList.addNode(s1);
        singlyLinkedList.addNode(s2);
        singlyLinkedList.addNode(s3);
        singlyLinkedList.addNode(new Student(46, "Vikash"));
        singlyLinkedList.traverse();
        Node deleteNode = singlyLinkedList.deleteNode();
        System.out.println(deleteNode);
        Student searchStudent = new Student(12, "Ramesh");
        System.out.println("singlyLinkedList.searchNode(s2) = " + singlyLinkedList.searchNode(searchStudent));

        System.out.println("-----------------------------------");
        System.out.println("s2.equals(s2) = " + s2.equals(s2));

        System.out.println("searchStudent.hashCode() = " + searchStudent.hashCode());
        System.out.println("s2.hashCode() = " + s2.hashCode());
    }
}
