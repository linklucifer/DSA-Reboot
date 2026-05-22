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

//    search a node in a LinkedList
    int search(int val){
        if (head == null){
            return -1;
        }
        Node temp = head;
        int idx = 0;
        while (temp != null){
            if (temp.val == val){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

//    get method
    int get(int idx){
        Node temp = head;
        for (int i = 1; i <= idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }

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
        if (tail == null) {
            addAtHead(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    void  insert(int val, int idx){
        if (idx < 0 || idx > size){
            System.out.println("Invalid Index!");
            return;
        }

        if (idx == 0){
            addAtHead(val);
        }
        else if(idx == size){
            addAtTail(val);
        }
        else {
//            take a temp node and keep it at head and traverse till the idx - 1 then insert the value at the next of temp and update the pointers
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++){
                temp = temp.next;
            }
            Node node = new Node(val);
            node.next = temp.next;
            temp.next = node;
            size++;
        }
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

//    delete a node at tail
    void deleteTail(){
        if (head == null){
            System.out.println("LinkedList is empty");
            return;
        }

//        if only one node is present
        if (head == tail){
            head = tail = null;
            size--;
            return;
        }

//        traverse till second last node
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
//        delete tail
        temp.next = null;
        tail = temp;
        size--;
    }

//    delete any node at any index
    void delete(int idx){
        if (idx < 0 || idx >= size){
            System.out.println("Invalid Index!");
            return;
        }

        if (idx == 0){
            deleteAtHead();
            return;
        }

        Node temp = head;
        for (int i = 1; i < idx; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;   // this line is actually deleting the node
        if (idx == size - 1){
            tail = temp;  // we are deleting tail
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
        l1.addAtTail(60);
        l1.display();
        l1.addAtHead(1);
        l1.display();
        l1.deleteAtHead();
        l1.display();
        System.out.println(l1.size);
        System.out.println(l1.search(40));
        l1.insert(48, 2);
        l1.display();
        System.out.println(l1.get(0));
        l1.delete(5);
        l1.display();
        l1.deleteTail();
        l1.display();
    }
}
