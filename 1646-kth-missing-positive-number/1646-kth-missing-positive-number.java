class Solution {
    public int findKthPositive(int[] arr, int k) {
       int l=1;
       int h=arr[arr.length-1]+k;
       while(l<h){
        int mid=(l+h)/2;
        int ho=0;    
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                ho+=1;
            }
            else{
                break;
            }
        }
        if((mid-ho)<k){
            l=l+1;
        }
        else{
            h=h-1;
        }
       }
       return l;
    }
}