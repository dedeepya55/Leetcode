class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> p = new PriorityQueue<>((a, b) -> Integer.compare(a, b));
        for (int i = 0; i < nums.length; i++) {
            p.add(nums[i]);
        }
        int j = 0;
        int[] arr = new int[nums.length];
        while (!p.isEmpty()) {
            int a = p.poll();
            if (!p.isEmpty()) {
                int b = p.poll();
                System.out.println(a);
                System.out.println(b);
                arr[j] = b;
                j++;
                arr[j] = a;
                j++;
            } else {
                arr[j] = a;
                j++;
            }
        }

        return arr;
    }
}
