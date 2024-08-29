class KthLargest {
    public List<Integer> q=new ArrayList<Integer>();
    public int K;
    public KthLargest(int k, int[] nums) {
        K=k;
        for(int i:nums){
            q.add(i);
        }
        // for (int i:nums){
        //     add(i);
        // }
    }
    
    public int add(int val) {
        q.add(val);
        Collections.sort(q);   
        System.out.println(q.size()-K);    
        return q.get(q.size()-K);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */