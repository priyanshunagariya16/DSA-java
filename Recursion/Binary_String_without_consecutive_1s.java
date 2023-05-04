package Recursion;

public class Binary_String_without_consecutive_1s {
    public static void printbinaryString(int n, int lastdigit, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printbinaryString(n-1, 0, str+"0");
        if(lastdigit==0){
            printbinaryString(n-1, 1, str+"1");
        }
    }
    public static  void main(String args[]){
        printbinaryString(3, 0, "");
    }
}
