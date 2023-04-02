package Recursion;

public class Last_Occurence {
    public static int lastOccurence(int arr[], int i, int key){
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccurence(arr,i-1,key);
    }
    public static void main(String args[]){
        int arr[] = {2,33,5,6,7,3,6,7,4,7,4,8,4};
        int i=arr.length-1;
        int key=7;
        System.out.println(lastOccurence(arr,i,key));
    }
}
