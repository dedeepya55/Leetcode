class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> i:m.entrySet()){
            if(isPrime(i.getValue())){
                return true;
            }
        }
        return false;
    }
    public boolean isPrime(int num){
        if(num==1){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}