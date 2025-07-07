class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int originalColor = image[sr][sc];

        if(originalColor == color){
            return image;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc});
        image[sr][sc] = color;

        int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        
        while(!queue.isEmpty()){
            int[] arr = queue.poll();
            int r = arr[0];
            int c = arr[1];

            for(int[] dir : directions){
                int nr = r + dir[0];
                int nc = c + dir[1];

                if(nr >= 0 && nr < n && nc >= 0 && nc < m && image[nr][nc] == originalColor){
                    image[nr][nc] = color;
                    queue.add(new int[]{nr, nc});
                }
            }
        }
        return image;
    }
}
