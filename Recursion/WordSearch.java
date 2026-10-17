class Solution {
    public boolean exist(char[][] board, String word) {
        
       boolean[][] visited = new boolean[board.length][board[0].length];

       for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(isWordContains(board,word,0,i,j,visited)){
                    return true;
                }
            }
       }
       return false;
    }

    private boolean isWordContains(char[][] board,String word,int idx,int row,int col,boolean[][] visited){

        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length){
            return false;
        }

        if(visited[row][col]){
            return false;
        }

        if(board[row][col] != word.charAt(idx)){
            return false;
        }

        if(idx == word.length()-1){
            return true;
        }

        visited[row][col] = true;


        boolean found =
            isWordContains(board, word, idx + 1,row + 1, col, visited)|| isWordContains(board, word, idx + 1,row - 1, col, visited)
         || isWordContains(board, word, idx + 1,row, col - 1, visited)|| isWordContains(board, word, idx + 1,row, col + 1,visited);

        visited[row][col] = false;

        return found;
    }
}
