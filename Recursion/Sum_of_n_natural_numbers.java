package Recursion;
import java.util.*;
public class Sum_of_n_natural_numbers {
    public static int sumofNatural(int n){
        if(n==1){
            return 1;
        }
        return n + sumofNatural(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumofNatural(n));
    }
}
