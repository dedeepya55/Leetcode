class Solution {
    public boolean hasAllCodes(String s, int k) {
        int len=1<<k;
        Set<String>n=new HashSet<>();
        for(int i=0;i<s.length()-k+1;i++){
            n.add(s.substring(i,i+k));
        }
        return n.size()==len;
    }
}