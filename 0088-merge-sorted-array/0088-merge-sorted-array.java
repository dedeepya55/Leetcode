class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while(m>0 && n>0){
            if(nums1[m-1]>=nums2[n-1]){
                nums1[m+n-1] = nums1[m-1];
                System.out.println(nums1[m+n-1]+" "+(m+n-1));
                m-=1;
            }
            else if(nums2[n-1]>=nums1[m-1]){
                nums1[m+n-1] = nums2[n-1];
                System.out.println(nums1[m+n-1]+" "+(m+n-1));
                n-=1;
            }
        }
    for(int i=n-1;i>=0;i--){
        nums1[i]=nums2[i];
    }
    }
}