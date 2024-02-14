
// PRINT LONGEST COMMON SUBSEQUENCE 



public class LongestCommonSubsequence {

    static int[][] lcs(String X, String Y) {
        int m = X.length();
        int n = Y.length();

        int[][] L = new int[m + 1][n + 1];

        // Building the L[m+1][n+1] array bottom-up
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X.charAt(i - 1) == Y.charAt(j - 1))
                    L[i][j] = L[i - 1][j - 1] + 1;
                else
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
            }
        }
        return L;
    }

    static String printLCS(int[][] L, String X, String Y) {
        int index = L[X.length()][Y.length()];
        char[] lcs = new char[index + 1];
        lcs[index] = '\0'; // Set the terminating character

        // Start from the right-most-bottom-most corner
        int i = X.length(), j = Y.length();
        while (i > 0 && j > 0) {
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                lcs[index - 1] = X.charAt(i - 1);
                i--;
                j--;
                index--;
            } else if (L[i - 1][j] > L[i][j - 1])
                i--;
            else
                j--;
        }
        return new String(lcs);
    }

    public static void main(String[] args) {
        String X = "ABCZXDEUXFG";
        String Y = "HZIJXKUXLMN";
        int[][] L = lcs(X, Y);
        String lcs = printLCS(L, X, Y);
        System.out.println("LCS of " + X + " and " + Y + " is " + lcs);
    }
}
