class Solution {
    public int minBitFlips(int start, int goal) {
        int f=0;
        int x=start^goal;
        while(x>0){
            f=f+(x&1);
            x=x>>1;
        }
        return f;
    }
}