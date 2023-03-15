package Two_D_array;

public class Search_in_a_sorted_matrix {
    public static boolean search(int matrix[][], int key){
        int row = 0; int col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key is found at: ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160}};
        int key = 110;
        search(matrix,key);
    }
}
