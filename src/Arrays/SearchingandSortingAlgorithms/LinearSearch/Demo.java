package Arrays.SearchingandSortingAlgorithms.LinearSearch;

public class Demo {
    public static void main(String[] args) {
        int[] arr={10,2,7,1,18,20,11,36};
        int key = 11;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                System.out.println("Found 11 at index : "+i );
            }
        }
    }
}
