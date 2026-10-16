class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> res = new ArrayList<>();
        findAllParenthesis(0,n,new StringBuilder(),res,0,0);
        return res;
    }

    private void findAllParenthesis(int idx,int len,StringBuilder sb,List<String> res,int open,int close){

        if(open == len && len == close){
            res.add(sb.toString());
            return;
        }

        if(idx == len*2){
            return;
        }

        if(open < len){
            sb.append("(");
            findAllParenthesis(idx+1,len,sb,res,open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }
  
        if(close < open){
            sb.append(")");
            findAllParenthesis(idx+1,len,sb,res,open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }  
    }
}
