package Bit_manipulation;

public class get_ith_bit {
    public static void geti(int n, int i){
        int bitmask = 1<<i;
        if((n&bitmask)==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        geti(10,2);
    }
}
