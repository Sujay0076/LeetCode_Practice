class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<>();
        if(n < 2){
            res.add(List.of(1));
            return res;
        }
        for(int i=1;i<=n;i++){
            res.add(generateCols(i));
        }
        return res;
    }
    public List<Integer> generateCols(int row){
        int ans =1;
        List<Integer> rowans = new ArrayList<>();
        rowans.add(1);
        for(int j=1;j<row;j++){
            ans = ans * (row - j);
            ans = ans/j;
            rowans.add(ans);
        }
        return rowans;
    }

}
