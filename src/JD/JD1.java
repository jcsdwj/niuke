package JD;
/*
Author: 大排面加蛋
Date  : 2022/08/23 10:07
*/

public class JD1 {
    public int getMost(int[][] board) {
        // write code here
//        board[0][1]+=board[0][0];
//        board[1][0]+=board[0][0];
        for (int j=1;j<board[0].length;j++){
            board[0][j]+=board[0][j-1];
        }
        for (int j=1;j<board.length;j++){
            board[j][0]+=board[j-1][0];
        }
        //要考虑边界值
        for (int i=1;i< board.length;i++){
            for (int j =1;j<board[0].length;j++){
                board[i][j]+=Math.max(board[i-1][j],board[i][j-1]);
            }
        }
        return board[board.length-1][board[0].length-1];
    }
}
