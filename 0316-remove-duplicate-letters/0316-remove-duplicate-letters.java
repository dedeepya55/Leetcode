class Solution {
    public String removeDuplicateLetters(String s) {
       StringBuilder ans=new StringBuilder();
       int[] count=new int[10000];
       boolean[] used=new boolean[10000];
       for(char c:s.toCharArray()){
        count[c]++;
       }
       for(char c:s.toCharArray()){
        count[c]--;
        if(used[c]){
            continue;
        }
        while(ans.length()>0 && last(ans)>c && count[last(ans)]>0){
            used[last(ans)]=false;
            ans.setLength(ans.length()-1);
        }
        used[c]=true;
        ans.append(c);
       }
       return ans.toString();
    }
    public char last(StringBuilder sb){
        return sb.charAt(sb.length()-1);
    }
}