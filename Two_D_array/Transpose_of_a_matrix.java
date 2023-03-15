package Two_D_array;

public class Transpose_of_a_matrix {
    public static void print(int matrix[][]){
        System.out.println("The matrix is: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6}};
        int row = 2;
        int col = 3;
        print(matrix);
        int transpose[][] = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0;j<col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        print(transpose);
    }
}
