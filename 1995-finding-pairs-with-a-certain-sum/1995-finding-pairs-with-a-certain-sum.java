class FindSumPairs {

    Map<Integer,Integer> m = new HashMap<>();
    int[] nums1, nums2; 

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;

        for(int i=0;i<nums2.length;i++){
            m.put(nums2[i], m.getOrDefault(nums2[i], 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int o = nums2[index];
        m.put(o, m.get(o)-1);
        nums2[index] += val;
        m.put(nums2[index], m.getOrDefault(nums2[index],0)+1);
    }
    
    public int count(int tot) {
        int cnt=0;
        for(int i=0;i<nums1.length;i++){
            cnt += m.getOrDefault(tot - nums1[i], 0);
        }
        return cnt;
    }
}
