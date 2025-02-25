class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        String s="";
        while(n!=0){
            if((n&1)==1){
                s=0+s;
            }
            else{
                s=1+s;
            }
            n=n>>1;
        }
        
        return Integer.parseInt(s,2);
    }
}