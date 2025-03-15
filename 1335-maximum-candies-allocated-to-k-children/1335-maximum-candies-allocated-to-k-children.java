class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low=0;
        int high=(int)1e7;
        while(low<high){
            int mid=(low+high+1)/2;
            long count=0;
            for(int c:candies){
                count+=c/mid;
            }
            if(count>=k){
                low=mid;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}