class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int c=0;
        List<Integer> l=new ArrayList<>(m.values());
        for(int i:l){
            System.out.println(i);
            if(i%3==1 && i>2){
                if(i==4){
                    c+=2;
                }
                else{
                    int k=i/3;
                    c+=k-1;
                    c+=2;
                }
            }
            else if(i%3==2){
                c+=(i/3);
                c+=1;
            }
           else if(i%2==0 || i%3==0){
                if(i%3==0){
                    c+=(i/3);
                }
                else{
                    c+=(i/2);
                }
            }
            else{
                return -1;
            }
        }
        return c;
    }
}