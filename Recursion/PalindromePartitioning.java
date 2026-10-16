class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> res = new ArrayList<>();
        findAllPalindromePartitions(s,0,res,new ArrayList<>());  
        return res; 
    }

    private void findAllPalindromePartitions(String s,int idx,List<List<String>> res,List<String> temp){

            if(idx == s.length()){
                res.add(new ArrayList<>(temp));
                return;
            }

           
           for(int i=idx;i<s.length();i++){
                String sb = s.substring(idx,i+1);
                if(isValid(sb)){
                    temp.add(sb);
                    findAllPalindromePartitions(s,i+1,res,temp);
                    temp.remove(temp.size()-1);
                }
           }

    }
    private boolean isValid(String s){
        int left =0;
        int right = s.length()-1;

        while(left <= right  && s.charAt(left) == s.charAt(right)){
            left++;
            right--;
        }
        return left > right;
    }
}
