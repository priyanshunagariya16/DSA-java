package Recursion;

public class x_to_the_power_n {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int nm1 = power(x,n-1);
        return x*nm1;
    }
    public static void main(String args[]){
        int x = 2;
        int n = 10;
        System.out.println(power(x,n));
    }
}
