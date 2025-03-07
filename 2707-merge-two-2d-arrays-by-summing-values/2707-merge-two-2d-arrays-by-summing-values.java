class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int p1 = 0, p2 = 0;
        List<List<Integer>> ans = new ArrayList<>();

        while (p1 < nums1.length && p2 < nums2.length) {
            int k = nums1[p1][0];
            int lo = nums2[p2][0];

            if (k == lo) {
                List<Integer> l = new ArrayList<>();
                l.add(k);
                l.add(nums1[p1][1] + nums2[p2][1]); 
                ans.add(l);
                p1++;
                p2++;
            } 
            else if (k < lo) {
                List<Integer> l = new ArrayList<>();
                l.add(k);
                l.add(nums1[p1][1]);
                ans.add(l);
                p1++;
            } 
            else {
                List<Integer> l = new ArrayList<>();
                l.add(lo); 
                l.add(nums2[p2][1]);
                ans.add(l);
                p2++;
            }
        }
        while (p1 < nums1.length) {
            List<Integer> l = new ArrayList<>();
            l.add(nums1[p1][0]);
            l.add(nums1[p1][1]);
            ans.add(l);
            p1++;
        }
        while (p2 < nums2.length) {
            List<Integer> l = new ArrayList<>();
            l.add(nums2[p2][0]);
            l.add(nums2[p2][1]);
            ans.add(l);
            p2++;
        }
        int[][] ans22 = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            ans22[i][0] = ans.get(i).get(0);
            ans22[i][1] = ans.get(i).get(1);
        }

        return ans22;
    }
}
