package Recursion;

public class First_Occurence {
    public static int firstOccurence(int arr[], int i, int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr,i+1,key);
    }
    public static void main(String args[]){
        int arr[] = {2,4,5,7,78,3,2,5,77,5};
        int i=0;
        int key = 7;
        System.out.println(firstOccurence(arr,i,key));
    }

}
