package Recursion;
import java.util.*;
public class Print_n_to_1_in_Increasing_order {
    public static void printnum(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printnum(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnum(n);
    }
}
