package Bit_manipulation;

public class update_ith_bit {
    public static int cleari(int n, int i){
        int bitmask = ~(1<<i);
        return(n&bitmask);
    }
    public static void seti(int n, int i){
        int bitmask = 1<<i;
        System.out.println(n|bitmask);
    }
    public static void updatei(int n, int i, int newbit){
//        if(newbit==0){
//            cleari(n,i);
//        }
//        else{
//            seti(n,i);
//        }

        n = cleari(n,i);
        int bitmask = newbit<<i;
        System.out.println(n|bitmask);
    }
    public static void main(String[] args) {
        updatei(10,1, 0);
    }
}
