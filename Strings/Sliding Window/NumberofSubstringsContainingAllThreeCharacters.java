class Solution {
    public int numberOfSubstrings(String s) {
        int count= 0;
        int a =0;
        int b =0;
        int c =0;
        int j =0;

        for(int i=0;i<s.length();i++){
            char right = s.charAt(i);
            if(right == 'a')a++;
            else if(right == 'b') b++;
            else if(right == 'c') c++;

          
            while((a > 0) && (b > 0) && (c > 0)){
                 char left = s.charAt(j);
                if(left == 'a')a--;
                else if(left == 'b')b--;
                else if(left == 'c')c--;
                j++;
            }
            count += j;
        }
        return count;  
    }
}
