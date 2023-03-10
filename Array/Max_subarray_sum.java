package Array;

public class Max_subarray_sum {
    public static void maxSubarray(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currsum=0;
                for(int k=i; k<=j; k++){
                    currsum+=arr[k];
                }
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("The max subarray sum is "+maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,-1,7,-4};
        maxSubarray(arr);
    }
}
