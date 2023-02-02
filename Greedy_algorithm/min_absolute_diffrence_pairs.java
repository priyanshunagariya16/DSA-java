import org.w3c.dom.ls.LSOutput;
import java.util.*;
public class min_absolute_diffrence_pairs {
    public static void main(String[] args) {
        int A[] = {6,4,3,1,7};
        int B[] = {2,1,6,7,8};

        Arrays.sort(A);
        Arrays.sort(B);

        int mindiff = 0;
        for(int i=0; i<A.length; i++){
            mindiff += Math.abs(A[i]-B[i]);
        }
        System.out.println(mindiff);
    }

}
