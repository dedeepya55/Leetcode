class Solution {
    public int majorityElement(int[] nums) {
        int ele=0;
        int cnt=0;
        for(int i:nums){
            if(cnt==0){
                ele=i;
            }
            if(ele==i){
                cnt++;
            }
            else{
                cnt--;
            } 
        }
        return ele;
    }
}