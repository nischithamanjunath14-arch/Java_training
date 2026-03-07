package CollectionFrameworks.Maps.HashMap;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"d");
        System.out.println(map.get(2));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey(3));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);
    }
}
