package Recursion;
import java.util.*;
public class Factorial_of_a_num {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n*fnm1;
        return fn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
