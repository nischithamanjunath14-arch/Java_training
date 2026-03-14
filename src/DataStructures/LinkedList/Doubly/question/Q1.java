package DataStructures.LinkedList.Doubly.question;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

class DoublyLinkedList {

    Node head;

    // insert at end
    void insert(int val) {
        Node n = new Node(val);

        if (head == null) {
            head = n;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = n;
        n.prev = temp;
    }


    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }


    void rotate(int N) {

        Node temp = head;


        for (int i = 1; i < N; i++) {
            temp = temp.next;
        }

        Node newHead = temp.next;

        // go to last node
        Node last = newHead;
        while (last.next != null) {
            last = last.next;
        }

        // connect last node to old head
        last.next = head;
        head.prev = last;

        // break connection
        temp.next = null;
        newHead.prev = null;

        // update head
        head = newHead;
    }
}

 class Main {
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insert(1);
        dll.insert(2);
        dll.insert(3);
        dll.insert(4);
        dll.insert(5);

        System.out.println("Original List:");
        dll.display();

        dll.rotate(3);

        System.out.println("After Rotation:");
        dll.display();
    }
}