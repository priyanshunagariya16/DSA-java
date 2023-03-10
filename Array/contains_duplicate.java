package Array;

public class contains_duplicate {
    public static boolean isDuplicate(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        boolean duplicate = isDuplicate(arr);
        if(duplicate==true){
            System.out.println("The array contain duplicates");
        }
        else{
            System.out.println("The array does not contain duplicates");
        }
    }
}
