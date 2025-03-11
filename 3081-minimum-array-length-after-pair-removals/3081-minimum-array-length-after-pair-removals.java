class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int i=0;
        int n=nums.size();
        int j=(n+1)/2;
        int pa=0;
        while(j<n){
            while(j<n && nums.get(i)>=nums.get(j)){
                j++;
            }
            if(j<n){
                pa+=2;
            }
            i++;j++;
        }
        return n-pa;
    }
}