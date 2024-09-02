class Solution {
    public int numTrees(int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result = result * (2 * n - i) / (i + 1);
        }
        result = result / (n + 1);
        return (int) result;
    }
}
