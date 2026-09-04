import java.util.*;

class SetMatrixZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }            
        }
        setZeroes(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) {
        int col0 =1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){

                    matrix[i][0] =0;

                    if(j != 0){
                        matrix[0][j] =0;
                    }else{
                        col0 =0;
                    }

                }
            }
        }
        
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] =0;
                    }
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j] =0;
            }
        }

        if(col0 == 0){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }

    }
}