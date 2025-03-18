class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int l=0;
        int r=arr.length-1;
        while(l<arr.length-1 && arr[l+1]>=arr[l]){
            l++;
        }
        while(r>0 && arr[r]>=arr[r-1]){
            r--;
        }
        System.out.println(l+" "+r);
        int ans=Math.min(arr.length-1-l,r);
        int i=l;int j=arr.length-1;
        while(j>=0 && j>=r && j>i && i>=0){
            // System.out.println(arr[i]+" "+arr[j] +" "+j+" "+i);
            if(arr[i]<=arr[j]){
                j--;
            }
            else{
                i--;
            }
            ans=Math.min(ans,j-i);
         }
        return ans;
    }
}