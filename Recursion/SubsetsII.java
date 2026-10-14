class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

         Arrays.sort(nums);
         List<List<Integer>> res = new ArrayList<>();
       
         findAllSubsets(0,nums,res,new ArrayList<>());
         return res;
    }

    private void findAllSubsets(int idx,int[] nums,List<List<Integer>> res,List<Integer> temp){
        
        res.add(new ArrayList<>(temp));
        if(idx == nums.length){
            return;
        }

        for(int i=idx;i<nums.length;i++){
            
            if(i > idx && nums[i] == nums[i-1]){
                continue;
            }

            temp.add(nums[i]);
            findAllSubsets(i+1,nums,res,temp);
            temp.remove(temp.size()-1);
        }

       
    }
}
