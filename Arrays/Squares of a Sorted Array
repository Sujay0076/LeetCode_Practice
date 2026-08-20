class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int j=nums.length-1;
        int pos = nums.length-1;
        int i=0;
        while(i <= j && pos >= 0){
            int s1 = nums[i]*nums[i];
            int s2 = nums[j]*nums[j];
            if(s2 > s1){
                res[pos] = s2;
                j--;
            }
           else{
                res[pos] = s1;       
                i++;
            }
            pos--;
        }
        return res;
    }
}
