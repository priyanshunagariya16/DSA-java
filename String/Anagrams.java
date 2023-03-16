package String;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length()==str2.length()){
            char[] str1array = str1.toCharArray();
            char[] str2array = str2.toCharArray();
            Arrays.sort(str1array);
            Arrays.sort(str2array);
            boolean result = Arrays.equals(str1array, str2array);
            if(result){
                System.out.println("str1 and str2 are anagrams");
            }
            else{
                System.out.println("str1 and str2 are not anagrams");
            }
        }
        else{
            System.out.println("str1 and str2 are not anagrams");
        }
    }
}
