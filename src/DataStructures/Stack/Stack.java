package DataStructures.Stack;

public class Stack {
    int[] arr;
    int top;
    int size;

    Stack(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    void push(int val) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = val;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stacked Underflow");
            return;
        }
        arr[top] = 0;

        top--;
    }

    int Top() {
        if (top == -1) {
            System.out.println("Stacked Underflow");
            return -1;
        }
       return arr[top];
    }

        Boolean isEmpty(){
            return top == -1;

        }



}
class Driver{
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);



        st.pop();

        System.out.println(st.Top());
        System.out.println(st.isEmpty());
        st.push(60);
        st.push(70);


    }
}
