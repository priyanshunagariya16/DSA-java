package Array;

public class pairs_in_an_array {
    public static void pairs(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                sum++;
            }
            System.out.println();
        }
        System.out.println("The total no of pairs "+sum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        pairs(arr);
    }
}
