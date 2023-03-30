package Bit_manipulation;

public class clear_last_i_bits {
    public static int ClearIbits(int n, int i){
        int bitmask = ~(0)<<i;
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(ClearIbits(15,2));
    }
}
