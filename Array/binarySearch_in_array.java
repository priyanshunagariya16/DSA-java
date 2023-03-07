package Array;

public class binarySearch_in_array {
    public static int binarySearch(int arr[], int key){
        int start=0; int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,12,15,17,19,27,34,78};
        int key = 17;
        System.out.println("The index is "+binarySearch(arr,key));
    }
}
