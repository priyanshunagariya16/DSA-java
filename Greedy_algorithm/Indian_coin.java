import java.util.Comparator;
import java.util.*;
public class Indian_coin {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int count = 0;
        int amount = 678;
        Arrays.sort(coins, Comparator.reverseOrder());
        for(int i=0; i<coins.length; i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    count++;
                    amount -= coins[i];
                }
            }
        }
        System.out.println(count);
    }
}
