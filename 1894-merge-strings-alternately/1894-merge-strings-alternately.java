class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        StringBuilder merge=new StringBuilder();
        int k=Math.min(n,m);
        for(int i=0;i<k;i++){
            merge.append(word1.charAt(i));
            merge.append(word2.charAt(i));
        }
        if(n>m){
            merge.append(word1.substring(k));
        }
        else{
            merge.append(word2.substring(k));
        }
        return merge.toString();
    }
}