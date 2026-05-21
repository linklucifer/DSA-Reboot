package LinkedList;

// User defined data type
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

// User defined Data Structure
class Linkedlist {
    Node head;
    Node tail;
    int size;

    //    add a node at head
    void addAtHead(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    //    add node at the tail
    void addAtTail(int val) {
        Node node = new Node(val);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    //    delete a node at head
    void deleteAtHead() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        head = head.next;

//        check for, it the LinkedList of size 1
        if (head == null) {
            tail = null;
        }
        size--;
    }

    //    display the LinkedList
    void display() {
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.addAtTail(10);
        l1.addAtTail(20);
        l1.addAtTail(30);
        l1.addAtTail(40);
        l1.addAtTail(50);
        l1.display();
        l1.addAtHead(1);
        l1.display();
        l1.deleteAtHead();
        l1.display();
        System.out.println(l1.size);
    }
}
