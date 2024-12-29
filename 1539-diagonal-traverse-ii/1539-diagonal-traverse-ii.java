class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> 
            {
                if(a[0]!=b[0]){
                    return Integer.compare(a[0],b[0]);
                }
                return Integer.compare(a[1],b[1]);
            }
        );
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                pq.offer(new int[]{i + j, j,nums.get(i).get(j)});
            }
        }
        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            int[] arr=pq.poll();
            // System.out.println(arr[0]);
            // System.out.println(arr[1]);
            // System.out.println(arr[2]);
            result.add(arr[2]); 
        }
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }
}
