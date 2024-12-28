class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
            if (pq.size() > k) {
                pq.poll();
            }
        }
        // int[] arr=new int[k];
        // for(int i=0;i<k;i++){
        //     int[] abc=pq.poll();
        //     arr[i]=abc[1];
        // }
        // Arrays.sort(arr);
        List<int[]> largestElements = new ArrayList<>(pq);
        largestElements.sort(Comparator.comparingInt(a -> a[1]));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = largestElements.get(i)[0];
        }

        return result;
    }
}
