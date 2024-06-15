class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        double avg=sum/k;
        int c=0;
        if(avg>=threshold)
            {
                c++;
            }
        for(int i=k;i<arr.length;i++)
        {
            sum+=arr[i]-arr[i-k];
            double avg1=sum/k;

            System.out.println(avg1);
            if(avg1>=threshold)
            {
                c++;
            }
        }
        return c;
    }
}