package String;

public class Shotest_path {
    public static float path(String dir){
        int x = 0;
        int y = 0;
        for(int i=0; i<dir.length(); i++){
            char Dir = dir.charAt(0);
            if(Dir=='S'){
                y--;
            }
            else if(Dir=='N'){
                y++;
            }
            else if(Dir=='W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String dir = "WNEENESENNN";
        System.out.println(path(dir));
    }
}
