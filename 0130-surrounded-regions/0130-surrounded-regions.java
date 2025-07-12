class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;

        int rows = board.length, cols = board[0].length;

        boolean[][] marked = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O' && !marked[i][0]) bfs(board, i, 0, marked);
            if (board[i][cols - 1] == 'O' && !marked[i][cols - 1]) bfs(board, i, cols - 1, marked);
        }

        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O' && !marked[0][j]) bfs(board, 0, j, marked);
            if (board[rows - 1][j] == 'O' && !marked[rows - 1][j]) bfs(board, rows - 1, j, marked);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O' && !marked[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void bfs(char[][] board, int i, int j, boolean[][] marked) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        marked[i][j] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int[] dir : directions) {
                int x = curr[0] + dir[0];
                int y = curr[1] + dir[1];

                if (x >= 0 && x < board.length && y >= 0 && y < board[0].length
                        && board[x][y] == 'O' && !marked[x][y]) {
                    marked[x][y] = true;
                    queue.offer(new int[]{x, y});
                }
            }
        }
    }
}
