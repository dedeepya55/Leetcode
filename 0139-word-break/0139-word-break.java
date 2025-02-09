class Solution {
    int[] dp=new int[301];
    public int wordanswer(int i,String s,List<String> wordDict){
        if(i==s.length()) return 1;
        StringBuilder tmp=new StringBuilder();
        if(dp[i]!=-1) return dp[i];
        for(int j=i;j<s.length();j++){
            tmp.append(s.charAt(j));
            // System.out.println(tmp);
            if(wordDict.contains(tmp.toString())){
                if(wordanswer(j+1,s,wordDict) == 1) return dp[i]=1;
            }
        }
        return dp[i]=0;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
       Arrays.fill(dp,-1); 
       if(wordanswer(0,s,wordDict)==1){
        return true;
       }
       return false;
    }
}