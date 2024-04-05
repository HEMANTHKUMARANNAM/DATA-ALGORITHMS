import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] arr = new int[a];
        int[] brr = new int[b];
        
        for(int i =0 ; i< a ; i++ )
        {
            arr[i] = sc.nextInt();
        }
        
        for(int i =0 ; i< b ; i++)
        {
            brr[i] = sc.nextInt();
        }
        System.out.println("inpuut over");
        
        int[][] dp = new int[a+1][b+1];
        
        for(int i =0 ; i< a+1 ; i++ )
        {
            for(int j =0 ; j< b+1 ; j++ )
            {
                dp[i][j] = -1;
            }
        }
        
        int l = longsequence( arr ,  brr ,  arr.length , brr.length , dp );
        System.out.println("l = " + l);
        
        int i = arr.length;
        int j = brr.length;
        
        int[] ans = new int[Math.max(a,b)];
        int index =0;
        
        while( true )
        {
            if( i ==0 || j ==0 )
            {
                break;
            }

            if( arr[i-1] == brr[j-1] )
            {
                ans[index++] = arr[i-1];
                i--;
                j--;
                
            }
            else if( dp[i-1][j] > dp[i][j-1] )
            {
                i--;
            }
            else
            {
                j--;
            }
        }
        
        for( i =index-1 ; i>=0 ; i--)
        {
            System.out.print(ans[i] +" ");
        }
        
        
        
        
        
    }
    
    public static int longsequence( int[] a , int[] b , int i , int j , int[][] dp)
    {
        if( i ==0 || j ==0 )
        {
            return 0;
        }
        
        if( dp[i][j] != -1 )
        {
            return dp[i][j];
        }
        
        if( a[i-1] == b[j-1] )
        {
            dp[i][j] = 1+ longsequence(a, b, i-1, j-1 , dp);
            return dp[i][j];
        }
        
        
        dp[i][j] = Math.max( longsequence(a, b, i, j-1 , dp) , longsequence(a, b, i-1, j , dp) );
        return dp[i][j];
        
        
        
        
    }
    
    
    
}
