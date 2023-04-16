package Recursion;

public class Remove_duplicates_in_string {
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar-'a']==true){
            removeDuplicate(str, idx+1, newStr, map);
        }
        else{
            map[currchar-'a']=true;
            removeDuplicate(str, idx+1, newStr.append(currchar), map);
        }
    }
    public static void main(String args[]){
        String str = "aappbbbnncdd";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
