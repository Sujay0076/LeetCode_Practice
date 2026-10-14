class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        findAllUniqueSubsets(0,nums,res,new ArrayList<>());
        return res;
    }

    private void findAllUniqueSubsets(int idx,int[] nums,List<List<Integer>> res , List<Integer> temp){
        
        if(idx == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
    
        temp.add(nums[idx]);
        findAllUniqueSubsets(idx+1,nums,res,temp);
        temp.remove(temp.size()-1);
        findAllUniqueSubsets(idx+1,nums,res,temp);
    }
}
