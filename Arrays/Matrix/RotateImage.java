class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swapForTranspose(matrix,i,j);
            }
        }
        int left =0;
        int right =n-1;
        while(left < right){
            for(int i=0;i<n;i++){
                swapForRowReverse(matrix,i,left,right);
            }
            left++;
            right--;
        }
        
    }
    public void swapForRowReverse(int[][]mat,int i,int left,int right){
        int temp = mat[i][left];
        mat[i][left] = mat[i][right];
        mat[i][right] = temp;
    }
    public void swapForTranspose(int[][] mat,int i,int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
}
