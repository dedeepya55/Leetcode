class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = 0;
        
        for (int i = 0; i < accounts.length; i++) {
            int c = 0; 
            
            for (int j = 0; j < accounts[0].length; j++) {
                c += accounts[i][j]; 
            }
            
            if (c > m) {
                m = c;
            }
        }
        
        return m;
    }
}
