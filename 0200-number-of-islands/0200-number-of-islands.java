class Solution {
    public boolean[][] marked;
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int ans = 0;
        marked = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1' && !marked[i][j]) {
                    bfs(grid, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }

    public void bfs(char[][] grid, int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        marked[i][j] = true;

        int[][] dir = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int[] d : dir) {
                int x = cur[0] + d[0];
                int y = cur[1] + d[1];

                if (x >= 0 && x < grid.length &&
                    y >= 0 && y < grid[0].length &&
                    grid[x][y] == '1' && !marked[x][y]) {
                    q.offer(new int[]{x, y});
                    marked[x][y] = true;
                }
            }
        }
    }
}
