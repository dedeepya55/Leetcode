import java.util.*;

class Solution {
    private static final int MOD = 1000000007;

    public int stringCount(int n) {
        if (n < 4) return 0;

        long[][][][] dp = new long[n + 1][2][3][2];

        dp[0][0][0][0] = 1;
        
        for (int len = 1; len <= n; len++) {
            for (int l = 0; l < 2; l++) {
                for (int e = 0; e < 3; e++) {
                    for (int t = 0; t < 2; t++) {
                        long res = 0;
                        
                        if (l > 0) res = (res + dp[len - 1][l - 1][e][t]) % MOD;
                        if (e > 0) res = (res + dp[len - 1][l][e - 1][t]) % MOD;
                        if (t > 0) res = (res + dp[len - 1][l][e][t - 1]) % MOD;
                        
                        int rem = 23; 
                        if (l == 0) rem++;
                        if (e == 0) rem++;
                        if (t == 0) rem++;

                        res = (res + rem * dp[len - 1][l][e][t] % MOD) % MOD;
                        dp[len][l][e][t] = res;
                    }
                }
            }
        }
        
        return (int) dp[n][1][2][1]; 
    }
}
