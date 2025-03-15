class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; 
        }
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }
        
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long quotient = 0;
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        for (int i = 31; i >= 0; i--) {
            if ((b << i) <= a) {
                a -= (b << i);
                quotient |= (1L << i);
            }
        }

        return (int) (sign * quotient);
    }
}
