package Bit_manipulation;

public class clear_ith_bit {
    public static void cleari(int n, int i){
        int bitmask = ~(1<<i);
        System.out.println(n&bitmask);
    }
    public static void main(String[] args) {
        cleari(10,1);
    }
}
