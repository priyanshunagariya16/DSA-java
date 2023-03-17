package Bit_manipulation;

public class set_ith_bit {
    public static void seti(int n, int i){
        int bitmask = 1<<i;
        System.out.println(n|bitmask);
    }
    public static void main(String[] args) {
        seti(10,4);
    }
}
