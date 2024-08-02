class Solution {
    public int duplicateNumbersXOR(int[] nums) {
         Set<Integer> a=new HashSet<>();
         Set<Integer> b=new HashSet<>();
         for(int i:nums){
            if(a.contains(i)){
                b.add(i);
            }
            else{
                a.add(i);
            }
         }
         int re=0;
         for(int i:b){
            re=re^i;
         }
         return re;
    }
}