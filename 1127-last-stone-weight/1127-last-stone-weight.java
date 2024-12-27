class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p=new PriorityQueue<>((a,b)-> b-a);
        for(int i=0;i<stones.length;i++){
            p.add(stones[i]);
        }
        while(p.size()>1){
            int s1=p.poll();
            int s2=p.poll();
            if(s1!=s2){
                p.add(s1-s2);
            }
        }
        if(p.isEmpty()){
            return 0;
        }
        return p.poll();
    }
}