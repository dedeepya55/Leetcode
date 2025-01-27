class Solution {
    static final int MOD = 1_000_000_007;

    private long modExp(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod; 
            exp /= 2;
        }
        return result;
    }

    public int countGoodNumbers(long n) {
        long k = n / 2;
        long evenCount = modExp(5, k + (n % 2), MOD); 
        long oddCount = modExp(4, k, MOD);
        return (int) ((evenCount * oddCount) % MOD);
    }
}
