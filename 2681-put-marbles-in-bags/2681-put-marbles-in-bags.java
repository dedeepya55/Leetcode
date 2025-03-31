class Solution {
    public long putMarbles(int[] weights, int k) {
        int[] arr=new int[weights.length-1];
        for(int i=0;i<arr.length;i++){
            arr[i]=weights[i]+weights[i+1];
        }
        Arrays.sort(arr);
        long min=0;
        long max=0;
        for(int i=0;i<k-1;i++){
            min+=arr[i];
            max+=arr[arr.length-1-i];
        }
        return max-min;
    }
}