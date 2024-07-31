class Solution {
    public int xorOperation(int n, int start) {
        int[] arr=new int[n];
        arr[0]=start;
        for(int i=0;i<n-1;i++)
        {
            arr[i+1]=arr[i]+2;
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
            s=s^arr[i];
        }
        return s;
    }
}