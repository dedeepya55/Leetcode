class Solution {
    public static int count(int n){
        int c=0;
        while(n>0){
            if((n&1)==1){
                c+=1;
            }
            n=n>>1;
        }
        return c;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int s=0;
        for(int i=0;i<nums.size();i++)
        {
            if(count(i)==k)
            {
                System.out.println(i);
                s=s+nums.get(i);
            }
        }
        return s;
    }
}