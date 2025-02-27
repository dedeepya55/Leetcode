class Solution {
    public int lenLongestFibSubseq(int[] arr) {
       Map<Integer,Integer> m=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        m.put(arr[i],i);
       }
       int ans=0;
       int[][] dp=new int[arr.length][arr.length];
       
       for(int i=0;i<arr.length;i++){
         for(int j=0;j<i;j++){
            int prev=arr[i]-arr[j];
            if(prev<arr[j] && m.containsKey(prev)){
                int k=m.get(prev);
                    dp[j][i]=Math.max(dp[k][j]+1,3);
                    ans=Math.max(ans,dp[j][i]);
            }
            else{
                dp[j][i]=2;
            }
        }
       }
       return ans > 2 ? ans : 0;
    }
}