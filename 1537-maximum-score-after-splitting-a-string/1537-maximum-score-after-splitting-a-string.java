class Solution {
    public int maxScore(String s) {
        int[] z=new int[s.length()+1];
        z[0]=0;
        int[] o=new int[s.length()+1];
        o[0]=0;
        int t=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                z[i+1]=z[i]+1;
                o[i+1]=o[i];
            }
            else{
                t++;
                o[i+1]=o[i]+1;
                z[i+1]=z[i];
            }
        }
        int maxScore=Integer.MIN_VALUE;
        for(int i=1;i<z.length-1;i++){
            int score=z[i]+(t-o[i]);
            maxScore=Math.max(maxScore,score);
        }
        return maxScore;
    }
}