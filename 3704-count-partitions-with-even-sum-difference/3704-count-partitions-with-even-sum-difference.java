class Solution {
    public boolean even(int num){
        if(num%2==0){return true;}
        else{
            return false;
        }
    }
    public int countPartitions(int[] nums) {
        int[] arr=new int[nums.length+1];
        arr[0]=0;
        for(int i=0;i<nums.length;i++){
            arr[i+1]=arr[i]+nums[i];
        }
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            int k=arr[i+1];
            int h=arr[nums.length]-arr[i+1];
            System.out.println(k);
            System.out.println(h);
            int a=Math.abs(h-k);
            if(even(a)){
                count++;
            }
        }
        return count;
    }
}