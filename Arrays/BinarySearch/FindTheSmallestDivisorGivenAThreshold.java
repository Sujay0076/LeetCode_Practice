class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max =nums[0];
        for(int num : nums){
            max = Math.max(num,max);
        }
        if(threshold == nums.length){
            return max;
        }
        int low =1;
        int high =max;
        int mid =0;
        int count=0;
        while(low <= high){
            mid = low+(high-low)/2;
            count=0;
            for(int num:nums){
                count+= (int)Math.ceil((double)num/mid);
            }
            if(count <= threshold){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}
