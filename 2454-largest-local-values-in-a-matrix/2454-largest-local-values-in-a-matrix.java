class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] arr = new int[n-2][n-2];
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int m = Integer.MIN_VALUE;
                for (int qi = 0; qi < 3; qi++) {
                    for (int qj = 0; qj < 3; qj++) {
                        m = Math.max(m, grid[i + qi][j + qj]);
                    }
                }
                arr[i][j] = m;
            }
        }
        
        return arr;
    }
}
