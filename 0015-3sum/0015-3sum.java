import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> kim=new HashSet<>();
       Arrays.sort(nums);
       for(int i=0;i<nums.length-2;i++){
        int k=i+1;
       int j=nums.length-1;
       while(k<j)
       {
        if(nums[i]+nums[k]+nums[j]==0)
        {
            List<Integer> lim=new ArrayList<>(Arrays.asList(nums[i],nums[k],nums[j]));
            kim.add(lim);
        }
       if(nums[i]+nums[k]+nums[j]<0)
        {
            k++;
        }
        else
        {
            j--;
        }
       }
       }
       List<List<Integer>> list1=new ArrayList<>(kim);
       return list1;
    }
}