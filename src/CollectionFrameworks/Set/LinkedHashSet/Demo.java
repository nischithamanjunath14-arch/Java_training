package CollectionFrameworks.Set.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo {
    public static void main(String[] args) {

            LinkedHashSet<Integer> set=new LinkedHashSet<>();
            set.add(100);
            set.add(101);
            set.add(102);
            set.add(100);
            System.out.println(set);
    }
}
