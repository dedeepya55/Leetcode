class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        if (s.charAt(n - 1) == '1') return false; 
        boolean[] dp = new boolean[n];
        dp[0] = true;
        int reachable = 0; 
        for (int i = 1; i < n; i++) {
            if (i >= minJump) reachable += dp[i - minJump] ? 1 : 0;
            if (i > maxJump) reachable -= dp[i - maxJump - 1] ? 1 : 0;

            dp[i] = s.charAt(i) == '0' && reachable > 0;
        }
        return dp[n - 1];
    }
}
