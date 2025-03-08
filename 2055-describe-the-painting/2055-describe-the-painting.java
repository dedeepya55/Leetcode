class Solution {
    public List<List<Long>> splitPainting(int[][] segments) {
        TreeMap<Integer, Long> map = new TreeMap<>();
        for (int[] seg : segments) {
            map.put(seg[0], map.getOrDefault(seg[0], 0L) + seg[2]); 
            // System.out.println(map.get(seg[0]));
            map.put(seg[1], map.getOrDefault(seg[1], 0L) - seg[2]); 
            // System.out.println(map.get(seg[1]));
        }
        // for(Map.Entry<Integer,Long> entry:map.entrySet()){
        //     System.out.println(entry.getKey()+" "+entry.getValue());
        // }

        List<List<Long>> ans = new ArrayList<>();
        long prev = -1, sum = 0;

        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            int curr = entry.getKey();

            if (prev != -1 && sum > 0) {
                ans.add(Arrays.asList(prev, (long) curr, sum));
            }

            sum += entry.getValue(); 
            prev = curr; 
        }

        return ans;
    }
}