class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int left =0;
        int depth =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                depth++;
            }
            else{
                depth--;
                if(depth == 0){
                    sb.append(s.substring(left+1,i));
                    left = i+1;
                }
            }
        }
        return sb.toString();
    }
}
