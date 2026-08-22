class Solution {
    public int majorityElement(int[] nums) {
        int candidate =0;
        int count =0;
        for(int num : nums){
            if(count == 0){
                count =1;
                candidate = num;
            }
            else if(candidate == num){
                count++;
            }
            else if(candidate != num){
                count--;
            }
            if(count > nums.length/2){
                return candidate;
            }
        }
        return candidate;
    }
}
