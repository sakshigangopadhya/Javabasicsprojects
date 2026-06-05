public class nqueens
{
    static void NQueens(int[][] board, int row, int n)
    {
        if (row == n)
        {
            printBoard(board, n);
            return;
        }

        for (int j = 0; j < n; j++)
        {
            if (issafe(board, row, j, n))
            {
                board[row][j] = 1;
                NQueens(board, row + 1, n);
                board[row][j] = 0;
            }
        }
    }

    static boolean issafe(int[][] board, int row, int col, int n)
    {
        for (int i = 0; i < row; i++)
        {
            if (board[i][col] == 1)
            {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
        {
            if (board[i][j] == 1)
            {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < n; i--, j++)
        {
            if (board[i][j] == 1)
            {
                return false;
            }
        }

        return true;
    }

    static void printBoard(int[][] board, int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int n = 4;
        int[][] board = new int[n][n];
        NQueens(board, 0, n);
    }
} 