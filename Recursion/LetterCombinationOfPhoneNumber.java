class Solution {
    public List<String> letterCombinations(String digits) {

        String[] arr = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };

        List<String> res = new ArrayList<>();

        findAllLetterCombinations(0,new StringBuilder(),digits,arr,res);
        return res;
    }

    private void findAllLetterCombinations(int idx,StringBuilder sb,String digits,String[] arr,List<String> res){
        if(sb.length() == digits.length()){
            res.add(sb.toString());
            return;
        }
        int n = digits.charAt(idx) - '0';
        String s = arr[n];
        for(char c : s.toCharArray()){

            sb.append(c);
            findAllLetterCombinations(idx+1,sb,digits,arr,res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
