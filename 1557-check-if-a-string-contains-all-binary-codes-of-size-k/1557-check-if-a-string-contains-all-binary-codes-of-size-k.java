class Solution {
    public boolean hasAllCodes(String s, int k) {
        int len=1<<k;
        if(s.length()<k){
            return false;
        }
        Set<Integer>n=new HashSet<>();
        // for(int i=0;i<s.length()-k+1;i++){
        //     n.add(s.substring(i,i+k));
        // }
        int c=0;
        for(int i=0;i<k;i++){
            c= (c<<1)|(s.charAt(i)-'0');
        }
        n.add(c);
        int a=(1<<k)-1;
        for(int i=k;i<s.length();i++){
             c= ((c<<1)|(s.charAt(i)-'0')) & a;
             n.add(c);
             if(n.size()==len)
             {
                return true;
             }
        }
        return n.size()==len;
    }
}