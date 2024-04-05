public class test {
    static void printLCS(String X, String Y, int[][] dp, int i, int j) {
        if (i == 0 || j == 0) {
            return;
        }
        if (X.charAt(i - 1) == Y.charAt(j - 1)) {
            printLCS(X, Y, dp, i - 1, j - 1);
            System.out.print(X.charAt(i - 1));
        } else if (dp[i - 1][j] > dp[i][j - 1]) {
            printLCS(X, Y, dp, i - 1, j);
        } else {
            printLCS(X, Y, dp, i, j - 1);
        }
    }

    public static void main(String[] args) {
        String X = "nicklekumar";
        String Y = "kumarhemanth";
        int m = X.length();
        int n = Y.length();
        int[][] dp = new int[m + 1][n + 1];

        // Building the dp table
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Printing the longest common subsequence
        printLCS(X, Y, dp, m, n);
    }
}
