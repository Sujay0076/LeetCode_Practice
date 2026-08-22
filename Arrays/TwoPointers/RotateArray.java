class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k =  k % n;
        if(k < 0){
          k += nums.length;
        }
        rotateArray(0,n-1,nums);
        rotateArray(0,k-1,nums);
        rotateArray(k,n-1,nums);
    }
    public void rotateArray(int left,int right,int[]arr){
        while(left <= right){
            int temp = arr[left];
            arr[left] =arr[right];
            arr[right] = temp;
            left++;
            right--; 
        }
    }
}
