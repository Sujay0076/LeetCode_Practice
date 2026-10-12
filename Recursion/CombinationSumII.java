class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        return findAllCombinations(0,candidates,target,new ArrayList<>(),new ArrayList<>());   
    }

    private List<List<Integer>> findAllCombinations(int i,int[] arr,int target,List<Integer> temp,List<List<Integer>> res){

        if(target == 0){
            res.add(new ArrayList<>(temp));
            return res;
        }
        if(i == arr.length){
            return res;
        }

        if(arr[i] <= target){
            temp.add(arr[i]);
            findAllCombinations(i+1,arr,target-arr[i],temp,res);
            temp.remove(temp.size()-1);
        }

        int next = i + 1;

        while (next < arr.length && arr[next] == arr[i]) {
            next++;
        }
        findAllCombinations(next, arr, target, temp, res);
        return res;
    }
}
