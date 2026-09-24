class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low =0;
        int high =matrix.length-1;

        int mid =0;

        while(low <= high){
            mid = low+(high-low)/2;
            if(matrix[mid][0] > target){
                high = mid-1;
            }
            else if(matrix[mid][0] == target){
                return true;
            }
            else{
                low = mid+1;
            }
        }

        int row = low-1;
        if(row < 0){
            return false;
        }
        low =0;
        high = matrix[0].length-1;

        while(low <= high){
            mid = low+(high-low)/2;
            if(matrix[row][mid] > target){
                high = mid-1;
            }
            else if(matrix[row][mid] == target){
                return true;
            }
            else{
                low = mid+1;
            }
        }
        return false;
        
    }
}
