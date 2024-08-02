class Solution {
    public int[] countBits(int n) {
        int[] ar = new int[n + 1]; 
        for (int i = 0; i <= n; i++) {
            int c = 0;
            int n1 = i;
            while (n1 > 0) {
                c += n1 & 1;
                n1 >>= 1;
            }
            ar[i] = c;
        }
        return ar;
    }
}
