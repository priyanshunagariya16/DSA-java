package Bit_manipulation;

public class clear_range_of_bits {
    public static int clearInRange(int n,int i, int j){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int c = a|b;
        return n&c;

    }
    public static void main(String args[]){
        System.out.println(clearInRange(127,2,4));
    }
}
