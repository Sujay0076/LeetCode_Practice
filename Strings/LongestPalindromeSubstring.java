class Solution {
    public String longestPalindrome(String s) {
        String longestString = "";
        int max =0;

        for(int i=0;i<s.length();i++){
        
            String s1 = expand(i, i + 1, s);
            String s2 = expand(i, i, s);

            if(s1.length() > max){
                max = s1.length();
                longestString = s1;
            }

            if(s2.length() > max){
                max = s2.length();
                longestString = s2;
            }
            
        }
        return longestString;
    }
    public String expand(int i,int j,String res){
        while(i >= 0 && j <= res.length()-1 && res.charAt(i) == res.charAt(j)){
            i--;
            j++;
        }
        return res.substring(i+1,j);
    }

}
