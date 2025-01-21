import java.util.*;

class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        TreeMap<Integer, Integer> left = new TreeMap<>();
        TreeMap<Integer, Integer> right = new TreeMap<>();
        int n = nums.length;
        double[] result = new double[n - k + 1];
        int leftSize = 0, rightSize = 0;

        for (int i = 0; i < n; ++i) {
            // Add the new number to the right heap
            right.merge(nums[i], 1, Integer::sum);

            // Move the smallest element from right to left
            int smallestInRight = right.firstKey();
            moveElement(right, left, smallestInRight);
            leftSize++;

            // Balance the sizes of the heaps
            if (leftSize > rightSize + 1) {
                int largestInLeft = left.lastKey();
                moveElement(left, right, largestInLeft);
                leftSize--;
                rightSize++;
            }

            // When the window size is reached
            int j = i - k + 1;
            if (j >= 0) {
                // Calculate the median
                if (k % 2 == 1) {
                    result[j] = left.lastKey(); // Odd window size
                } else {
                    result[j] = ((double) left.lastKey() + right.firstKey()) / 2; // Even window size
                }

                // Remove the oldest element in the window
                int oldest = nums[j];
                if (left.containsKey(oldest)) {
                    removeElement(left, oldest);
                    leftSize--;
                } else {
                    removeElement(right, oldest);
                    rightSize--;
                }
            }
        }

        return result;
    }

    // Move an element from one map to another
    private void moveElement(TreeMap<Integer, Integer> from, TreeMap<Integer, Integer> to, int value) {
        from.merge(value, -1, Integer::sum);
        if (from.get(value) == 0) {
            from.remove(value);
        }
        to.merge(value, 1, Integer::sum);
    }

    // Remove an element from a map
    private void removeElement(TreeMap<Integer, Integer> map, int value) {
        map.merge(value, -1, Integer::sum);
        if (map.get(value) == 0) {
            map.remove(value);
        }
    }
}
