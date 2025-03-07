class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long share=0;
        long mod=1000000007;
       int[] dp=new int[n];
       dp[0]=1;
       for(int i=1;i<n;i++){
        if(i-delay>=0){
            share+=dp[i-delay];
        }
        if(i-forget>=0){
            share-=dp[i-forget];
        }
        share=share+mod;
        share=share%mod;
        dp[i]=(int) share;        
       } 
    //    for(int i=0;i<n;i++){
    //     System.out.println(dp[i]);
    //    }
       long ans=0;
       for(int i=n-forget;i<n;i++){
            ans=(ans+dp[i])%mod;
       }
      return (int)ans;
    }
}