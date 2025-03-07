class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int h=triangle.size();
        int[] dp=new int[h+1];
        for(int i=h-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                dp[j]=Math.min(dp[j],dp[j+1])+triangle.get(i).get(j);
            }
        }
        for(int i=0;i<dp.length;i++){
            System.out.println(dp[i]);
        }
        return dp[0];
    }
}