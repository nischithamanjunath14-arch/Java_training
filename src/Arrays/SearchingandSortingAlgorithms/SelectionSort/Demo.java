package Arrays.SearchingandSortingAlgorithms.SelectionSort;

public class Demo {
    public static void main(String[] args) {

        int[] arr = {8,15,19,3,5,14,90,7,6,};
        int n =arr.length;

        for(int i=0;i<n-1;i++){
            int min=i;


            for(int j=i+1;j<n;j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

                    int temp = arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;


                }


        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
