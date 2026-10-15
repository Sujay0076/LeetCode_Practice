class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> res = new ArrayList<>();
        findAllCombination(1,k,n,new ArrayList<>(),res);
        return res;
    }
    private void findAllCombination(int curr,int k,int target,List<Integer> temp,List<List<Integer>> res){

        if(temp.size() == k){
            if(target == 0){
                res.add(new ArrayList<>(temp));
            }
             return;
        }

        for(int i=curr;i<=9;i++){
            if(i <= target){
                temp.add(i);
                findAllCombination(i+1,k,target-i,temp,res);
                temp.remove(temp.size()-1);
            }
        }

    }
}
