package Array;

public class print_subarrays {
    public static void subarrays(int arr[]){
        int totalSubarrays=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                totalSubarrays++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Total number of subarrays "+totalSubarrays);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,9};
        subarrays(arr);
    }
}
