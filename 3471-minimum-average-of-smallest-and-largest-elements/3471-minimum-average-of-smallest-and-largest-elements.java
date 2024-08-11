class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums); int i=0,j=nums.length-1;
        double c=Double.MAX_VALUE;
        double n=0;
        while(i<j)
        {
            n=(nums[i]+nums[j])/2.0;
            if(c>n){
            c=n;
            }
            i++;
            j--;
        }
        return c;
    }
}