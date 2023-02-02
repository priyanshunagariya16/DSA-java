import java.util.Comparator;
import java.util.*;
public class max_length_chain_of_pairs {
    public static void main(String[] args) {
        int pair[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pair, Comparator.comparing(o->o[1]));
        int chainlen = 1;
        int chainEnd = pair[0][1];
        for(int i=1; i<pair.length; i++){
            if(pair[i][0]>chainEnd){
                chainlen++;
                chainEnd = pair[i][1];
            }
        }
        System.out.println(chainlen);
    }
}
