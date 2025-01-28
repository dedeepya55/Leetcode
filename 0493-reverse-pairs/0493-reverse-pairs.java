class Solution {
    public int count = 0;

    public void merge(int[] nums, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = nums[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = nums[m + 1 + i];
        }
        //condition check
        int i = 0, j = 0;
        while (i < n1) {
            while (j < n2 && L[i] > 2L * R[j]) { 
                j++;
            }
            count += j; 
            i++;
            j=0;
        }
        //merge
        i = 0; 
        j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                nums[k++] = L[i++];
            } else {
                nums[k++] = R[j++];
            }
        }
        while (i < n1) {
            nums[k++] = L[i++];
        }
        while (j < n2) {
            nums[k++] = R[j++];
        }
    }

    public void sort(int[] nums, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        sort(nums, left, mid);
        sort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    public int reversePairs(int[] nums) {
        count = 0;
        sort(nums, 0, nums.length - 1);
        return count;
    }
}
