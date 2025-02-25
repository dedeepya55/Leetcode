class Solution {
    public int numOfSubarrays(int[] arr) {
        long ps=0;long ec=1;long oc=0;long c=0;
        long mod=1_000_000_007;
       for(int i=0;i<arr.length;i++){
        ps+=arr[i];
        if(ps%2==0){
            c=(c+oc)%mod;
            ec++;
        }
        else{
            c=(c+ec)%mod;
            oc++;
        }
       }
       return (int)c;
    }
}