package Two_D_array;

public class Diagonal_sum {
    public static int diagonalsum(int matrix[][]){
        int sum = 0;
//        for(int i=0; i<matrix.length; i++){
//            for(int j=0; j<matrix.length; j++){
//                if(i==j){
//                    sum+=matrix[i][j];
//                }
//                else if(i+j == matrix.length-1){
//                    sum+=matrix[i][j];
//                }
//            }
//        }

        for(int i=0; i<matrix.length; i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum+=matrix[i][i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sum = diagonalsum(matrix);
        System.out.println(sum);
    }
}
