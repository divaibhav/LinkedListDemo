package com.niit.linkedlist.interactivedemo;

public class SinglyLinkedList {
    private Node head;
    private Node tail;

    //adding at the beginning
    public void addNode(Student student) {
        Node node = new Node(student);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    //deleting from end
    public Node deleteNode() {
        Node deletedNode = null;
        if (!isEmpty()) {
            Node temp = head;
            Node previous = null;
            while (temp.getNext() != null) {
                previous = temp;
                temp = temp.getNext();
            }
            deletedNode = temp;
            if (previous == null) {
                // only one node
                head = null;
                tail = null;
            } else {
                //more than one node
                previous.setNext(null);
                tail = previous;
            }

        }
        return deletedNode;
    }

    public void traverse() {
        Node temp = head;
        System.out.print("Head -->");
        while (temp != null) {
            System.out.print(temp + "-->");
            temp = temp.getNext();
        }
        System.out.println("null <-- tail");
    }

    //search node
    public boolean searchNode(Student searchStudent) {
        boolean response = false;
        // to search I have to traverse
        Node temp = head;
        while (temp != null && !(temp.getData().equals(searchStudent))) {
            // update temp
            temp = temp.getNext();
        }
        if (temp != null) {
            // temp is my searchStudent or searchStudent is present in linked list
            response = true;
            System.out.println(temp);
        }
        return response;
    }

    private boolean isEmpty() {
        return head == null;
    }

}
