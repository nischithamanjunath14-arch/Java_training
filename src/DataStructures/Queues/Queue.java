package DataStructures.Queues;

import DataStructures.Stack.Stack;

public class Queue {
    int[] arr;
    int front;
    int back;
    int size;

    Queue(int size) {
        this.size = size;
        front = -1;
        back = -1;
        arr = new int[size];
    }

    void push(int val) {
        if (back == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        back++;
        arr[back] = val;
        if (front == -1) {
            front++;
        }
    }
        void pop () {
            if (front == -1 || front > back) {
                System.out.println("Stacked Underflow");
                return;
            }
            arr[front] = 0;
            front++;
        }


        int peek() {
            if (front == -1 || front > back) {
                System.out.println("Stacked Underflow");
                return -1;
            }
            return arr[front];
        }

        Boolean isEmpty () {
            return (front == -1 || front > back);

        }


    }


    class Driver {
        public static void main(String[] args) {
            Queue qu = new Queue(5);
            qu.push(10);
            qu.push(20);
            qu.push(30);
            qu.push(40);
            qu.push(50);
            System.out.println(qu.peek());
            qu.pop();
            System.out.println(qu.peek());
            qu.pop();
            System.out.println(qu.peek());
            qu.pop();
            System.out.println(qu.peek());
            qu.pop();
            System.out.println(qu.peek());
            qu.pop();
            System.out.println(qu.peek());
            qu.pop();
            System.out.println(qu.isEmpty());


        }

    }