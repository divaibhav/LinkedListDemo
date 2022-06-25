package com.niit.demo;

public class SinglyLinkedList {
    //head or start
    //tail or end (it is optional)
    private Node head;
    private Node tail;

    //we are using default constructor
    //insert
    // insert at beginning
    public void addNodeAtBeginning(int data) {
        //step 1: create new node
        Node node = new Node(data);
        //step 2: check if linked list is empty
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            //new node next will refer to existing linked list, which is referred by head
            node.setNext(head);
            head = node;
        }
    }

    public void addNodeAtTheEnd(int data) {
        // step 1:
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    //adding  a last node without using tail reference
    // we have to traverse and find the last node
    public void addLastNodeWithOutUsingTail(int data) {
        Node node = new Node(data);
        Node temp = head;
        while (temp != null) {
            if (temp.getNext() == null) {
                break;
            }
            temp = temp.getNext();
        }
        if (temp == null) {
            head = node;
            tail = node;
        } else {
            temp.setNext(node);
            tail = node;
        }
    }

    public void addNodeBeforeGivenData(int data, int givenData) {
        Node node = new Node(data);
        Node temp = head;
        Node previous = null;
        while (temp != null && temp.getData() != givenData) {
            previous = temp;
            temp = temp.getNext();
        }
        if (temp != null) {
            if (previous != null) {
                node.setNext(previous.getNext());
                //node.setNext(temp);
                previous.setNext(node);
            }
            //given data is first node
            else {
                node.setNext(head);
                head = node;
            }
        }

    }

    public void addNodeAfterGivenData(int data, int givenData) {
        //complete this method
        Node node = new Node(data);
        Node temp = head;
        while (temp != null && temp.getData() != givenData) {
            temp = temp.getNext();
        }
        if (temp != null) {
            //add the node
            node.setNext(temp.getNext());
            temp.setNext(node);
            if (temp == tail) {
                // inserting at end
                // tail will be updated
                tail = node;
            }
        }

    }

    //traversing each node once
    public void traverse() {
        Node temp = head;
        while (temp != null) {


            System.out.print(temp.getData() + "--->");
            // update the temp with the next node
            temp = temp.getNext();
        }
    }

    private boolean isEmpty() {
        return head == null;
    }

    //delete of remove a node
    // from beginning
    public Node deleteFromBeginning() {
        Node deletedNode = null;
        // when we can not delete, when list is empty
        if (!isEmpty()) {
            deletedNode = head;
            head = head.getNext();
            deletedNode.setNext(null);

        }

        return deletedNode;

    }

    // form end
    public Node deleteFormEnd() {
        Node deletedNode = null;
        Node temp = head;
        Node previous = null;
        while (temp != null && temp.getNext() != null) {
            previous = temp;
            temp = temp.getNext();
        }
        //when temp will be null  -> list is empty
        // when previous will be null -> when list is empty and if only one node is there
        if (temp != null) {
            deletedNode = temp;
            if (previous != null) {
                // previous.setNext(null);
                deletedNode = tail;
                tail = previous;
            } else {
                // deletedNode  = head;
                head = null;
                tail = null;
            }
        }
        return deletedNode;
    }

    // form in-between
    // means deleting node with given data
    // first search
    public Node deleteGivenNode(int data) {
        Node deletedNode = null;
        Node temp = head;
        Node previous = null;
        while (temp != null && temp.getData() != data) {
            previous = temp;
            temp = temp.getNext();
        }

        //reaching end of list temp will be null or  if list is empty temp is null
        if (temp != null) {
            deletedNode = temp;
            if (previous != null) {
                previous.setNext(temp.getNext());
                if (temp == tail) {
                    tail = previous;
                }
            } else {
                // only single node in linked list
                head = null;
                tail = null;
            }
            deletedNode.setNext(null);
        }
        // finding data - > temp is on data and previous is on previous node  of temp
        // if only single node, previous will be null
        // if list is empty temp is null
        return deletedNode;
    }


}
