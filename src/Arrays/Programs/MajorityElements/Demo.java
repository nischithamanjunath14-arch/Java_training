package Arrays.Programs.MajorityElements;

import java.util.concurrent.CountDownLatch;
//time complexity 0(n)
public class Demo {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        int candidate = arr[0];
        int count = 1;
        int n = arr.length;


        for (int i = 1; i < n; i++) {

            if (arr[i] == candidate) {

                count++;

            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }



            System.out.println("Majority element:"+candidate);


        }
    }
