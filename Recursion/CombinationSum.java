class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       
        
        return findCombination(0,candidates,target,new ArrayList<>(),new ArrayList<>());
        
    }
    private List<List<Integer>> findCombination(int i,int[] arr,int target,List<Integer> list,List<List<Integer>> res){

        if(target == 0){
            res.add(new ArrayList<>(list));
            return res;
        }
        if(i == arr.length){
            return res;
        }

        if(arr[i] <= target){
            list.add(arr[i]);
            findCombination(i,arr,target-arr[i],list,res);
            list.remove(list.size()-1);
        }

        findCombination(i+1,arr,target,list,res);
        

        return res;
    }
}
