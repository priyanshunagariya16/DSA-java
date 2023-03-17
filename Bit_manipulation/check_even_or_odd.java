package Bit_manipulation;

public class check_even_or_odd {
    public static void oddorEven(int n){
        if((n&1)==0){
            System.out.println(n+" is Even number");
        }
        else{
            System.out.println(n+" is odd number");
        }
    }
    public static void main(String[] args) {
        oddorEven(3);
        oddorEven(23);
        oddorEven(12);
    }
}
