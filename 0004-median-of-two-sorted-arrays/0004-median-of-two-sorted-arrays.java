class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k=nums1.length+nums2.length;
      int[] l=new int[k];
      for(int i=0;i<nums1.length;i++){
        l[i]=nums1[i];
      }
      int j=0;
      for(int i=nums1.length;i<k;i++){
        //  System.out.println(i);
        l[i]=nums2[j];
        j++;
      }
      Arrays.sort(l);
      for(int i=0;i<l.length;i++){
      System.out.println(l[i]);
      }
     int lo=0;
      int h=l.length-1;
      int mid=(lo+h)/2;
      double result;
      if(h%2==0){
        result=(double)l[mid];
      }
      else {
        double mi=l[mid];
         double mid2=l[mid+1];
         System.out.println(l[1]);
         System.out.println(mid2);
         result=(double)((mi+mid2)/2);
          System.out.println(l[mid]);
      }
      return result;
    }
}