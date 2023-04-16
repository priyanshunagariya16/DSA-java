package Recursion;

public class Friends_pairing_problem {
    public static int pairingWays(int n){
        if(n==1||n==2){
            return n;
        }
        int fnm1 = pairingWays(n-1);
        int fnm2 = pairingWays(n-2);
        int pairways = (n-1)*fnm2;
        int totways = fnm1+pairways;
        return totways;
    }
    public static void main(String args[]){
        int n = 25;
        System.out.println(pairingWays(n));
    }
}
