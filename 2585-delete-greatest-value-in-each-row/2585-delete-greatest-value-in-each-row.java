class Solution {
    public int deleteGreatestValue(int[][] grid) {
        List<Queue<Integer>> qu=new ArrayList<>();
        for(int[] arr:grid){
            Queue<Integer> q=new LinkedList<>();
            Arrays.sort(arr);
            for(int val:arr){
                q.add(val);
            }
            qu.add(q);
        }
        int ans=0;
        while(!qu.isEmpty()){
            int m=0;
            List<Queue<Integer>> n=new ArrayList<>();
            for(Queue<Integer> l:qu){
                if(!l.isEmpty()){
                int r=l.poll();
                m=Math.max(m,r); 
                if(!l.isEmpty()){
                    n.add(l);
                }
                }
            }
            ans+=m;
            qu=n;
        }
        return ans;
    }
}