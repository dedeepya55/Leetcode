class Solution {
    public int findLUSlength(String a, String b) {
        int c=0;
        if(a.length()==b.length()){
            for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)){
             c++;
            }
        }
        }
        if(c==a.length()) return -1;
        if(a.length()>b.length()) return a.length();
        return b.length();
    }
}