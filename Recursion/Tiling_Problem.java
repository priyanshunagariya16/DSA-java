package Recursion;

public class Tiling_Problem {
    public static int tiles(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = tiles(n-1);
        int fnm2 = tiles(n-2);
        return fnm1+fnm2;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(tiles(n));
    }
}
