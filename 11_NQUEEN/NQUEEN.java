
// Java program to solve N Queen Problem using backtracking

public class NQUEEN {
	static final int N = 4;

	// A utility function to print solution
	static void printSolution(int board[][])
	{
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (board[i][j] == 1)
					System.out.print("Q ");
				else
					System.out.print(". ");
			}
			System.out.println();
		}
	}

	static boolean isSafe(int board[][], int row, int col)
	{
		int i, j;

		// Check this row on left side
		for (i = 0; i < col; i++)
			if (board[row][i] == 1)
				return false;

		// Check upper diagonal on left side
		for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
			if (board[i][j] == 1)
				return false;

		// Check lower diagonal on left side
		for (i = row, j = col; j >= 0 && i < N; i++, j--)
			if (board[i][j] == 1)
				return false;

		return true;
	}

	// A recursive utility function to solve N
	// Queen problem
	static boolean solveNQUtil(int board[][], int col)
	{
		// Base case: If all queens are placed
		// then return true
		if (col >= N)
			return true;

		// Consider this column and try placing
		// this queen in all rows one by one
		for (int i = 0; i < N; i++) {
			
			// Check if the queen can be placed on
			// board[i][col]
			if (isSafe(board, i, col)) {
				
				// Place this queen in board[i][col]
				board[i][col] = 1;

				// Recur to place rest of the queens
				if (solveNQUtil(board, col + 1) == true)
					return true;

				// If placing queen in board[i][col]
				// doesn't lead to a solution then
				// remove queen from board[i][col]
				board[i][col] = 0; // BACKTRACK
			}
		}

		// If the queen can not be placed in any row in
		// this column col, then return false
		return false;
	}

	public static void main(String[] args) 
	{
		int board[][] = { { 0, 0, 0, 0 },
						{ 0, 0, 0, 0 },
						{ 0, 0, 0, 0 },
						{ 0, 0, 0, 0 } };

		if (solveNQUtil(board, 0) == false) {
			System.out.print("Solution does not exist");
		}

		printSolution(board);
	}

}

