package CollectionFrameworks.List.LinkedList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.addFirst("Start");
        list.addLast("Stop");

        System.out.println("Array List: "+list);
        System.out.println(list.getFirst());
    }
}
