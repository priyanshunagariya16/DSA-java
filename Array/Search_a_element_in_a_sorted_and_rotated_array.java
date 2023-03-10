package Array;

public class Search_a_element_in_a_sorted_and_rotated_array {
    public static int searchElement(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[start]<=arr[mid]){
                if(arr[start]<=target && arr[mid]>=target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(arr[mid]<=target && arr[end]>=target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int index = searchElement(arr, target);
        System.out.println("The index of "+target+" is "+index);
    }
}
