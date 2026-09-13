class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last =-1;
        int low =0;
        int high = nums.length-1;
        int mid =0;
        while(low <= high){
            mid = low+(high-low)/2;
            if(nums[mid] >= target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(low < nums.length && nums[low] == target){
            first = low;
        }
        low =0;
        high = nums.length-1;
        while(low <= high){
            mid = low+(high-low)/2;
            if(nums[mid] <= target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if(high >= 0 && nums[high] == target){
            last = high;
        }
        return new int[]{first,last};
    }
}
