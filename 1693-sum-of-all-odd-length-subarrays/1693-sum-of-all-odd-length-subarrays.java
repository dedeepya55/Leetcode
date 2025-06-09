class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;

        for(int i=0;i<arr.length;i++){
            int contribution=(i+1)*(arr.length-i);
            int oC=(contribution+1)/2;
            sum+=oC*arr[i];
        }
        return sum;
  }
}