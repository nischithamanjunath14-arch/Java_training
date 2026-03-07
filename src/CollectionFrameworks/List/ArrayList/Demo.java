package CollectionFrameworks.List.ArrayList;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        System.out.println("Array List : "+list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.contains(10));
        System.out.println(list.remove(2));
        System.out.println("Array List : "+list);
        for(int i :list){
            System.out.print(i);
        }



    }
}
