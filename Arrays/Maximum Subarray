class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxSum =Integer.MIN_VALUE;
        if(nums.length == 1){
            return nums[0];
        }
        for(int num : nums){
            sum += num;

            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum < 0){
                sum =0;
            }

        }
        return maxSum;

    }
}
