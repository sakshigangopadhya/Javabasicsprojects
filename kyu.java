public class kyu {

    static void nqueens(int[][] board, int row, int n) {
        if (row == n) {
            printBoard(board, n);
            System.out.println();
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {

                // Place queen
                board[row][col] = 1;

                // Recur for next row
                nqueens(board, row + 1, n);

                // Backtrack
                board[row][col] = 0;
            }
        }
    }
    static boolean isSafe(int[][] board, int row, int col, int n) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {

            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
    static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 6; 
        int[][] board = new int[n][n];
        nqueens(board, 0, n);
    }
}