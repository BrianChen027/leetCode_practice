# 37. Sudoku Solver

#### Write a program to solve a Sudoku puzzle by filling the empty cells.
#### A sudoku solution must satisfy all of the following rules:

#### 1.Each of the digits 1-9 must occur exactly once in each row.
#### 2.Each of the digits 1-9 must occur exactly once in each column.
#### 3.Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
#### The '.' character indicates empty cells.

##### Example 1:
![image](https://user-images.githubusercontent.com/97871497/196697778-53e29eb8-4a66-4f11-997e-c7801a21d406.png)
#####    Input: board =
        [["5","3",".",".","7",".",".",".","."],
         ["6",".",".","1","9","5",".",".","."],
         [".","9","8",".",".",".",".","6","."],
         ["8",".",".",".","6",".",".",".","3"],
         ["4",".",".","8",".","3",".",".","1"],
         ["7",".",".",".","2",".",".",".","6"],
         [".","6",".",".",".",".","2","8","."],
         [".",".",".","4","1","9",".",".","5"],
         [".",".",".",".","8",".",".","7","9"]]
#####    Output:
        [["5","3","4","6","7","8","9","1","2"],
         ["6","7","2","1","9","5","3","4","8"],
         ["1","9","8","3","4","2","5","6","7"],
         ["8","5","9","7","6","1","4","2","3"],
         ["4","2","6","8","5","3","7","9","1"],
         ["7","1","3","9","2","4","8","5","6"],
         ["9","6","1","5","3","7","2","8","4"],
         ["2","8","7","4","1","9","6","3","5"],
         ["3","4","5","2","8","6","1","7","9"]]
![image](https://user-images.githubusercontent.com/97871497/196697882-d41aded6-c939-4522-854a-836170b7385d.png)



```
class Solution {
    public void solveSudoku(char[][] board) {
        List<int[]> emptySpace = new ArrayList<int[]>();
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] squares = new boolean[9][9];

        for(int i = 0; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == '.'){
                    emptySpace.add(new int[]{i, j});
                }else{
                    int num = board[i][j] - '1';
                    rows[i][num] = true;
                    cols[j][num] = true;
                    int numS = (i / 3) * 3 + (j / 3); // square 0 ~ 8
                    squares[numS][num] = true;
                }
            }
        }
        if(!emptySpace.isEmpty()){
            sudoHelper(board, rows, cols, squares, emptySpace, 0);
        }
    }

    boolean sudoHelper(char[][] board, boolean[][] rows, boolean[][] cols, boolean[][] squares, List<int[]> emptySpace, int index){
        if(emptySpace.size() == index){
            return true;
        }

        int[] point = emptySpace.get(index);
        int x = point[0];
        int y = point[1];
        int sq = (x / 3) * 3 + (y / 3);

        for(int i = 0 ; i < board.length ; i++){
            if(!rows[x][i] && !cols[y][i] && !squares[sq][i]){
                board[x][y] = (char)('1' + i);
                rows[x][i] = true;
                cols[y][i] = true;
                squares[sq][i] = true;
                if(sudoHelper(board, rows, cols, squares, emptySpace, index + 1)){
                    return true;
                }
                rows[x][i] = false;
                cols[y][i] = false;
                squares[sq][i] = false;
                board[x][y] = '.';
            }
        }

        return false;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196697966-1ea41b92-591a-4b83-9698-c88e39e895e1.png)
