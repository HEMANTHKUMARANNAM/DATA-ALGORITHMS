// Expected Time Complexity: O(N*min(|arri|)).
// Expected Auxiliary Space: O(min(|arri|)) for result.

    public class longestcommonprefix2 
    {
        String longestCommonPrefix(String arr[], int n)
        {
            int len = arr.length;
            
            if( len == 0 )
            {
                return "-1";
            }
            
            if( len == 1 )
            {
                return arr[0];
            }
            
            String prefix = arr[0];
            
            
            for(int i =0 ; i<n ; i++ )
            {
                int j =0;
                
                while( j < prefix.length() && j < arr[i].length() && ( prefix.charAt(j) == arr[i].charAt(j)  )  )
                {
                    j++;
                }
                
                prefix = prefix.substring(0,j);
                
                
            }
            
            
            if( prefix.equals("") )
            {
                return "-1";
            }
            
            return prefix;
            
            
            
        }
    
    
    
        /* Driver Function to test other function */
        public static void main(String[] args) {
            longestcommonprefix2 gfg = new longestcommonprefix2();
            String[] input = { "geeksforgeeks", "geeks", "geek", "geezer" };
            System.out.println("The longest Common Prefix is : " +gfg.longestCommonPrefix(input , input.length));
        }
    }