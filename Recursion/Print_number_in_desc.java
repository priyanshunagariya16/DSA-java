
package Recursion;
import java.util.*;
public class Print_number_in_desc {
    public static void printdesc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdesc(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printdesc(n);
    }
}
