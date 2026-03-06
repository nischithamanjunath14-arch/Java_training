package Arrays.Programs;

public class TwoSum {
    public static void main(String[] args) {


    int[] a1={2,7,11,15};
    int target= 9;
    for(int i=0;i< a1.length;i++){
        for(int j=i+1;j<a1.length;j++){
            if(a1[i]+a1[j] == target){
                System.out.print("Sums of : "+a1[i]+" "+a1[j]);
            }
        }
    }

    }
}
