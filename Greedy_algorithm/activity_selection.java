import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activity_selection {
    public static void main(String[] args) {
        //when end time is not sorted
        int start[] = {0, 1, 3, 5, 5, 8};
        int end[] = {6, 2, 4, 7, 9, 9};
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        //sorting
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //lamda function for sorting
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        //1st activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 0; i < start.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Max Acivities: " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();

        //when end time is sorted.
        /*int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        //end time based sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        //1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i=1; i<end.length; i++){
            //activity select
            if(start[i]>=lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
            }
        }
        System.out.println("Max Acivities: "+maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();*/
    }
}
