class Solution {
    public int missingNumber(int[] nums) {
        int missNum =0;
        for(int i=1;i<=nums.length;i++){
            missNum ^= i;
        }

        for(int num : nums){
            missNum ^= num;
        }
        return missNum;
    }
}
