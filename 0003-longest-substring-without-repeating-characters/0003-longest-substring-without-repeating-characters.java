class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> a=new HashSet<>();
        int k=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            while(a.contains(s.charAt(i)))
            {
                a.remove(s.charAt(j));
                j++;
            }
            a.add(s.charAt(i));
            k=Math.max(k,i-j+1);
        }
        return k;
    }
}