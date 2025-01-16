class Solution {
    public int maxProfit(int[] prices) {
        int m=0;
        for(int i=1;i<prices.length;i++){
            int d=Math.max(0,prices[i]-prices[i-1]);
            m+=d;
        }
        return m;
    }
}