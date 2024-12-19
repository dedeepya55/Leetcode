class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum=0;
        int n=gifts.length;
        while(k-->0){
            Arrays.sort(gifts);
            gifts[n-1]=(int)Math.sqrt(gifts[n-1]);
        }
        for(int i=0;i<n;i++){
            sum+=gifts[i];
        }
        return sum;
    }
}