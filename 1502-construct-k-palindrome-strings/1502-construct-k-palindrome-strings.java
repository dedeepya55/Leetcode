class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k){
            return false;
        }
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int c=0;
        for(int i=0;i<26;i++){
            c+=arr[i]%2;
        }
        return c<=k;
    }
}