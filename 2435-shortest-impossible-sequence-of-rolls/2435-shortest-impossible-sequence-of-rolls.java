class Solution {
    public int shortestSequence(int[] rolls, int k) {
        Set<Integer> s=new HashSet<>();
        int ans=1;
        for(int i=0;i<rolls.length;i++){
            s.add(rolls[i]);
            if(s.size()==k){
                ans++;
                s.clear();
            }
        }
        return ans;
    }
}