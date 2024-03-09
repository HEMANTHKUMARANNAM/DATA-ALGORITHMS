import java.util.Arrays;

public class NQUEEN_PRAC 
{

    public static void main(String[] args) 
    {
        int N = 20;

        int[][] board = new int[N][N];

        for(int i = 0; i < N; i++)
        {
            Arrays.fill(board[i] , 0);
        }

        
        // int[][] board =
        // {
        //     {0,0,0,0,0},
        //     {0,0,0,0,0},
        //     {0,0,0,0,0},
        //     {0,0,0,0,0},
        //     {0,0,0,0,0}
        // };
        solver(board, 0 );
    }


    // static boolean solver( int[][] board , int row  )
    // {
    //     if( row >= board.length)
    //     {
    //         return true;
    //     }

    //     for(int i = 0; i < board.length; i++)
    //     {
    //         if( features.issafe(board , row , i ) )
    //         {
    //             board[row][i] = 1;
    //             if(solver(board, row+1))
    //             {
    //                 features.printboard(board);
    //                 return true;
    //             }
    //             board[row][i] = 0;
    //         }

            
    //     }
    //     return false;

    // } 

    static void solver(int[][] board, int row) {
        if (row >= board.length) {
            features.printboard(board);
            return;
        }

        for (int i = 0; i < board.length; i++) 
        {
            
            if (features.issafe(board, row, i)) {
                board[row][i] = 1;
                solver(board, row + 1);
                board[row][i] = 0; // Backtrack
            }
            
        }
    }





}




class features
{
    static boolean issafe( int[][] board , int row , int col )
    {
        // row colum check
        for( int i = 0; i < board.length; i++ )
        {
            if( board[row][i] ==1)
            {
                return false;
            }
            if(board[i][col] ==1)
            {
                return false;
            }
        }

        int i = row;
        int j = col;

        i--;
        j--;
        
        while (i >=0 && j >=0 )
        {
            if(board[i][j] ==1)
            {
                return false;
            }
            i--;
            j--;
        }


        i = row;
        j = col;

        i++;
        j++;

        while (i < board.length && j < board.length )
        {
            if(board[i][j] ==1)
            {
                return false;
            }
            i++;
            j++;
        }








         // upper right diagonal
        for (i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }






        return true;
    }



    static void printboard(int[][] board)
    {
        for(int i = 0; i < board.length ; i++)
        {
            for(int j = 0; j < board.length ; j++)
            {
                if( board[i][j] == 1)
                {
                    System.out.print("Q");
                }
                else
                {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
        System.out.println("...........................");
    }




}