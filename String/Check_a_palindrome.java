package String;

public class Check_a_palindrome {
    public static boolean palindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("this is not a palindrome");
                return false;
            }
        }
        System.out.println("This is a palindrome");
        return true;

    }
    public static void main(String[] args) {
        String str =  "racecar";
        palindrome(str);

    }
}
