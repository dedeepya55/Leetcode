class Solution {
    public boolean isSub(String w,String s){
        int i=0;
        for(char c:s.toCharArray()){
            if(i<w.length() && w.charAt(i)==c){
                i++;
            }
        }
        return i==w.length();
    }
    public String findLongestWord(String s, List<String> dictionary) {
        String ans="";
        for(String w:dictionary){
            if(isSub(w,s)){
                if(ans.length()<w.length() || (ans.length()==w.length() && w.compareTo(ans)<0)){
                    ans=w;
                }
            }
        }
        return ans;
    }
}
