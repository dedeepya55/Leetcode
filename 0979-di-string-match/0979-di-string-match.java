class Solution {
    public int[] diStringMatch(String s) {
        int[] a=new int[s.length()+1];
        int l=0,h=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                a[i]=l++;
            }
            else{
                a[i]=h--;
            }
        }
        a[s.length()]=l;
        return a;
    }
}