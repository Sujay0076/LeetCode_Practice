class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        findAllUniqueCombinations(nums,0,res);
        return res;
    }
    private void findAllUniqueCombinations(int[] arr,int idx,List<List<Integer>> res){

        if(idx == arr.length){
            List<Integer> ds = new ArrayList<>();
            for(int num : arr){
                ds.add(num);
            }
            res.add(ds);
            return;
        }

        for(int i=idx;i<arr.length;i++){
            boolean swap = false;
            for(int j=idx;j<i;j++){
                if(arr[i] == arr[j]){
                    swap = true;
                    break;
                }

            }
            if(swap){
                continue;
            }
            swap(i,idx,arr);
            findAllUniqueCombinations(arr,idx+1,res);
            swap(i,idx,arr);
        }

    }
    private void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
}
