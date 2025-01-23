class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> m=new HashMap<>();
        int left=0;
        int right=0;
        int max=Integer.MIN_VALUE;
        while(right<fruits.length){
            m.put(fruits[right],m.getOrDefault(fruits[right],0)+1);
            while(m.size()>2 && left<right){
                m.put(fruits[left],m.get(fruits[left])-1);
                if(m.get(fruits[left])==0){
                    m.remove(fruits[left]);
                }
                 left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}