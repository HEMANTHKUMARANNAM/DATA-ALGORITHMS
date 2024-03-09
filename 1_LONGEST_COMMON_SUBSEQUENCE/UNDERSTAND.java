import java.util.Scanner;

public class UNDERSTAND
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();


        returndata data = Solution.lcs(a.length(), b.length(), a, b);

        int[][] dp = data.b;

        for(int i = 1; i < dp.length ; i++)
        {
            for(int j = 1; j < dp[i].length ; j++) 
            {
                String s = "";
                s += a.charAt(i-1) ;
                s += b.charAt(j-1);
                System.out.print(dp[i][j] + s + "\t");
            }
            System.out.println("");
        }

        sc.close();

    }
}













class returndata
{
    int a;
    int[][] b;
    returndata(int a, int[][] b)
    {
        this.a = a;
        this.b = b;
    }
}




class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static returndata lcs(int x, int y, String s1, String s2)
    {
        int[][] d = new  int[ x+1 ][ y+1 ];
        
        for(int i =0 ; i<= s1.length() ; i++ )
        {
            for(int j =0 ; j<= s2.length() ; j++)
            {
                d[i][j] = -1;
            }
        }

        returndata data = new returndata(LCS(x , y, s1 , s2 , d) , d);
        
        return data;
    }
    
    static int LCS(int x , int y , String s1 , String s2 , int[][] d)
    {
        if( x ==0 || y ==0 )
        {
            return 0;
        }
        
        if( d[x][y] != -1 )
        {
            return d[x][y];
        }
        
        if( s1.charAt(x-1) == s2.charAt(y-1) )
        {
            d[x][y] = 1+ LCS( x-1 , y-1 , s1 , s2 , d );
            
            return d[x][y];
        }
        
        int a = LCS( x-1 , y , s1 , s2 , d );
        int b = LCS( x , y-1 , s1 , s2 , d );
        
        d[x][y] = Math.max(  a, b  );
        
        return d[x][y];
        
        
        
    }
    
}
