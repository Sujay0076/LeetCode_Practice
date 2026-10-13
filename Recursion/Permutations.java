class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        return findCombinations(nums,new ArrayList<>(),0);
    }

    private List<List<Integer>> findCombinations(int[] arr,List<List<Integer>> res,int idx){
        if(idx == arr.length){
            List<Integer> ds = new ArrayList<>();
            for(int num : arr){
                ds.add(num);
            }
            res.add(new ArrayList<>(ds));
            return res;
        }

        for(int i=idx;i<arr.length;i++){
            swap(i,idx,arr);
            findCombinations(arr,res,idx+1);
            swap(i,idx,arr);
        }

        return res;

    }
    private void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
