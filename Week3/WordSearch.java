package Week3;
/*
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. 
 * The same letter cell may not be used more than once.
 */
class WordSearch {

    public boolean exist(char[][] board, String word) {
    
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board[i].length;j++){
            if(boardHelper(board, i, j, word,0)){
                return true;
            }
        }
    }
    return false;
}

    private boolean boardHelper(char[][] board, int i, int j, String word, int step){
        if(step==word.length())
            return true;

        if(i<0 || i >= board.length || j<0 || j>=board[i].length)
            return false;

        if((board[i][j] - word.charAt(step)) !=0 )
            return false;

        char record = board[i][j];
        board[i][j]='1';
        boolean res = boardHelper(board, i-1, j, word, step+1) || boardHelper(board, i, j-1, word, step+1) || boardHelper(board, i, j+1, word, step+1) || boardHelper(board, i+1, j, word, step+1);
        board[i][j]=record;
        return res;    
    }
}