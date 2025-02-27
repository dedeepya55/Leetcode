class Solution {
  public int longestEqualSubarray(List<Integer> nums, int k) {
    int ans = 0;
    Map<Integer, Integer> m = new HashMap<>();
    for (int l = 0, r = 0; r < nums.size(); r++) {
        m.put(nums.get(r), m.getOrDefault(nums.get(r), 0) + 1);
        ans = Math.max(ans, m.get(nums.get(r)));
        while ((r - l + 1) - ans > k) {
            m.put(nums.get(l), m.get(nums.get(l)) - 1);
            l++;
        }
    }
    return ans;
  }
}
