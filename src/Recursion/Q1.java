package Recursion;

    import java.util.*;

public class Q1 {

        static void generateSubsets(int[] arr, int index, List<Integer> current) {


            if (index == arr.length) {
                System.out.println(current);
                return;
            }

            current.add(arr[index]);
            generateSubsets(arr, index + 1, current);

            // Backtrack (remove the element)
            current.remove(current.size() - 1);

            // Exclude the current element
            generateSubsets(arr, index + 1, current);
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            List<Integer> current = new ArrayList<>();

            generateSubsets(arr, 0, current);
        }
    }

