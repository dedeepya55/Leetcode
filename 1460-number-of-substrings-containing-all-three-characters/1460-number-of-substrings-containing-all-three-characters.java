class Solution {
    public int numberOfSubstrings(String s) {
       int ans=0;
       int[] coo=new int[3];
       int l=0;
       for(char c:s.toCharArray()){
            coo[c-'a']++;
            while(coo[0]>0 && coo[1]>0 && coo[2]>0){
                coo[s.charAt(l++)-'a']--;
            }
            ans+=l;
       }
       return ans;
    }
}



