# 52. N-Queens II

#### The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
#### Given an integer n, return the number of distinct solutions to the n-queens puzzle.
#### Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

##### Example 1:
#####    Input: n = 4
#####    Output: 2
![image](https://user-images.githubusercontent.com/97871497/196331399-2dd9cab0-dd2a-4850-93c9-529f836c762d.png)

##### Example 2: 
#####    Input: n = 1
#####    Output: 1


```
class Solution {
    int totalPos = 0;
    public int totalNQueens(int n) {
        char[][] chessBoard = new char[n][n];
        for(char[] c:chessBoard){
            Arrays.fill(c, '.');
        }
        backTrack(chessBoard, 0, n);
        return totalPos;
    }
    public void backTrack(char[][] chessBoard, int row, int n){
        if(row == n){
            totalPos++;
        }
        for(int col = 0 ; col < n ; col++){
            if(checkValid(chessBoard, row, col, n)){
                chessBoard[row][col] = 'Q';
                backTrack(chessBoard, row+1, n);
                chessBoard[row][col] = '.';
            }
        }
    }
    public boolean checkValid(char[][] chessBoard, int row, int col, int n){
        for(int i = 0; i < row ; i++){
            if(chessBoard[i][col] == 'Q'){
                return false;
            }
        }

        for(int i = row-1, j = col-1; i >=0 && j >= 0; i--, j--){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }

        for(int i = row-1, j = col+1; i >= 0 && j <= n-1; i--, j++){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }


}
```

![image](https://user-images.githubusercontent.com/97871497/196331726-1fb98432-b0b3-47ef-86dc-a986f68200eb.png)
