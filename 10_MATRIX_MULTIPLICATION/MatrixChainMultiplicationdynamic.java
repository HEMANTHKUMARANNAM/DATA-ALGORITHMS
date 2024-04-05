import java.util.Arrays;

public class MatrixChainMultiplicationdynamic 
{
    public static void main(String[] args) 
    {
        int arr[] = { 1 , 2, 3 , 4 , 3 };

        int len = arr.length;

        
        int[][] dp = new int[len+1][len+1];

        for(int i = 0; i < len; i++)
        {
            Arrays.fill(dp[i], -1);
        }


        int ans = matrixmul(arr, 1, len-1 , dp );


        System.out.println("Minimum steps = " + ans);




    }



    static int  matrixmul( int[] arr , int s , int e  , int[][] dp)
    {

        if( s == e )
        {
            return 0;
        }

        int min = Integer.MAX_VALUE;

        for(int i =s ; i< e ; i++)
        {

            int a,b;

            if( dp[s][i] != -1 )
            {
                a = dp[s][i];
            }
            else
            {
                a = matrixmul(arr, s, i , dp);
            }


            if( dp[i+1][e] !=-1 )
            {
                b = dp[i+1][e];
            }
            else
            {
                b = matrixmul(arr,i+1 ,e, dp);
            }

            

            int count = a + b + arr[s-1]*arr[i]*arr[e];


            if(count < min)
            {
                min = count;
            }
            
            


        }




        return min;


    }










}
