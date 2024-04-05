

class Solution
{
    public int solveWordWrap (int[] nums, int k)
    {
        int len = nums.length;
        
        int dp[][] = new int[ nums.length +1][ k + nums.length  + 1 ];
        
        for(int i =0 ; i< nums.length; i++)
        {
            for(int j =0 ; j<  k + nums.length ; j++)
            {
                dp[i][j] = -1;
            }
        }
        
        
        return solvedynamic( nums , k , 0 , k , dp );
    
        
    }
    
    public static int solvedynamic( int[] nums , int k , int i ,int rem , int[][] dp )
    {
        if( i == nums.length )
        {
            return 0;
        }
        
        
        if( dp[i][rem+1] != -1 )
        {
            return dp[i][rem+1];
        }
        
        int ans =0;
        
        if( nums[i] > rem )
        {
            ans = (rem+1)*(rem+1) + solvedynamic( nums , k , i+1 , k-nums[i]-1  , dp );
        }
        else
        {
            
            int ch1 = (rem+1)*(rem+1) + solvedynamic( nums , k , i+1 , k-nums[i]-1  , dp );            
            int ch2 = 0 + solvedynamic( nums , k , i+1 , rem - nums[i] -1  , dp );
            
            ans= Math.min( ch1 , ch2 );
            
            
        }
        
        
        dp[i][rem+1] = ans;
        
        return ans;
        
        
    }
    

    
}