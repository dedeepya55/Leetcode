class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> l=new ArrayList<>();
        l.add(words[0]);
        if(words.length==1){
            return l;
        }
        else{
        for(int i=1;i<words.length;i++){
            if(groups[i]!=groups[i-1]){
                l.add(words[i]);
            }
        }
        }
        return l;
    }
}