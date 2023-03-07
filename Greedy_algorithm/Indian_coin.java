import java.util.Comparator;
import java.util.*;
public class Indian_coin {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int count = 0;
        int amount = 678;
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(coins, Comparator.reverseOrder());
        for(int i=0; i<coins.length; i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    count++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("The count is = "+count);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
