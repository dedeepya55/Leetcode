class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long ans=m*k; 
        System.out.println(bloomDay.length);
        System.out.println((long)m*k); 
        if((long)m*k>bloomDay.length) return -1;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            low=Math.min(low,bloomDay[i]);
            high=Math.max(high,bloomDay[i]);
        }
        // int ans=-1;
        while(low<high){
            int mid=(low+high)/2;
            int cnt=0;
            int b=0;
            System.out.println(mid);
            for(int i=0;i<bloomDay.length;i++){
                if(mid>=bloomDay[i]){
                    cnt++;
                    if(cnt==k){
                        b++;
                        cnt=0;
                    }
                }
                else{
                    cnt=0;
                }
            }
           if(b>=m){
            high=mid;
           }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}