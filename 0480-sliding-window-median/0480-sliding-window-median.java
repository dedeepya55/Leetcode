class Solution {
    
    private PriorityQueue<Integer> left;
    private PriorityQueue<Integer> right;
    private int leftRemoved;
    private int rightRemoved;
    private Map<Integer, Integer> removed;

    public double[] medianSlidingWindow(int[] nums, int k) {
        this.leftRemoved = 0;
        this.rightRemoved = 0;

        this.left = new PriorityQueue<Integer>((a, b) -> Integer.compare(b, a));
        this.right = new PriorityQueue<Integer>();
        this.removed = new HashMap<>();

        double[] ms = new double[nums.length - k + 1];
        int j = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (i >= k) {
                remove(nums[i - k]);
            }
            
            add(nums[i]);

            if (i >= k - 1) {
                ms[j++] = median();
            }
        }

        return ms;
    }

    void add(int n) {
        if (left.isEmpty() || n < left.peek()) {
            left.offer(n);

            if (left.size() - leftRemoved - (right.size() - rightRemoved) > 1) {
                right.offer(left.poll());
            }
        } else {
            right.offer(n);

            if (right.size() - rightRemoved > left.size() - leftRemoved) {
                left.offer(right.poll());
            }
        }
    }

    double median() {
        removeInvalidPeeks(true);
        removeInvalidPeeks(false);

        if (left.size() - leftRemoved > right.size() - rightRemoved) {
            return left.peek();
        }
        return ((long)left.peek() + (long)right.peek())/2.0;
    }

    void removeInvalidPeeks(boolean left) {
        PriorityQueue<Integer> q = left ? this.left : this.right;
        while (removed.containsKey(q.peek())) {
            int n = q.poll();
            removed.put(n, removed.get(n) - 1);
            if (removed.get(n) == 0) {
                removed.remove(n);
            }

            if (left) {
                leftRemoved--;
            } else {
                rightRemoved--;
            }
        }
    }

    void remove(int n) {
        removed.put(n, removed.getOrDefault(n, 0) + 1);
        if (n > left.peek()) {
            rightRemoved++;
        } else {
            leftRemoved++;
        }
    }
}