class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] arr=new int[nums.length];
        Arrays.fill(arr,-1);
        if(((2*k)+1) > nums.length) {
            return arr;
        }
       long c_s=0;
        for(int i=0;i<=k+k;i++){
            c_s+=nums[i];
        }
        for(int i=k;i<nums.length-k;i++){
            long w=c_s/(k+k+1);
            arr[i]=(int)w;
            if(i+k+1<nums.length){
            c_s+=nums[i+k+1]-nums[i-k];
            }
        }
        return arr;
    }
}