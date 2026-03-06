package Arrays.Programs;

public class Q1 {
    public static void main(String[] args) {


        int[] arr ={1,2,4,5};
        int n =5;
        int totalSum=n*(n+1)/2;
        int actualSum=0;
        for(int i=0;i<arr.length;i++){
            actualSum+=arr[i];

        }
        System.out.println("Missing number is: "+(totalSum-actualSum));
    }
}
