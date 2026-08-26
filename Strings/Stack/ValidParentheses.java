class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(ch == ')' && stack.peek() != '(')return false;
                if(ch == '}' && stack.peek() != '{')return false;
                if(ch == ']' && stack.peek() != '[')return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
