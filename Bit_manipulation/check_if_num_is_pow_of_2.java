package Bit_manipulation;

public class check_if_num_is_pow_of_2 {
    public static boolean IsPowOf2(int n){
        if((n&(n-1))==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println(IsPowOf2(16));
    }
}
