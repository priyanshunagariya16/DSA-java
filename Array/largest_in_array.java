package Array;

public class largest_in_array {
    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,8,12,45,2,15,5,37};
        int largest = largest(arr);
        System.out.println("the largest in a array is "+largest);
    }
}
