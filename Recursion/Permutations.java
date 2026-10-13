class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] freq = new boolean[nums.length];
        return findCombinations(nums,new ArrayList<>(),new ArrayList<>(),freq);
    }

    private List<List<Integer>> findCombinations(int[] arr,List<Integer> temp,List<List<Integer>> res,boolean[] freq){
        if(temp.size() == arr.length){
            res.add(new ArrayList<>(temp));
            return res;
        }

        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                temp.add(arr[i]);
                freq[i] = true;
                findCombinations(arr,temp,res,freq);
                freq[i] = false;
                temp.remove(temp.size()-1);
            }
        }

        return res;

    }
}
