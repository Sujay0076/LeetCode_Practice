class Solution {
    public List<Integer> getRow(int rowIndex) {
        long ans =1;
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for(int j=1;j<=rowIndex;j++){
            ans = ans*(rowIndex-j+1);
            ans = ans/j;
            res.add((int)ans);
        }
        return res;
    }
}
