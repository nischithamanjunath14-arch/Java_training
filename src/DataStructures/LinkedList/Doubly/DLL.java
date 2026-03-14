package DataStructures.LinkedList.Doubly;



class Node {
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DLL {

    Node head;

    DLL(){
        head = null;
    }

    // Insert at Head
    void insertAtHead(int val){
        Node n = new Node(val);

        if(head != null){
            head.prev = n;
            n.next = head;
        }

        head = n;
    }

    // Delete at Head
    void deleteAtHead(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // Display List
    void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}

class Driver {

    public static void main(String[] args) {

        DLL dll = new DLL();

        dll.insertAtHead(10);
        dll.insertAtHead(20);
        dll.insertAtHead(30);
        dll.insertAtHead(40);

        dll.display();

        dll.deleteAtHead();
        dll.display();
    }
}