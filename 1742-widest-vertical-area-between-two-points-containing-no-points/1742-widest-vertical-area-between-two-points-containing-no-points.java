class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n=0;int h=0;
        int[] arr=new int[points.length];
        for(int i=0,j=0;i<points.length;i++)
        {
            arr[i]=points[i][j];
        }
        Arrays.sort(arr);
        for(int i=1;i<points.length;i++)
        {
           n=Math.abs(arr[i]-arr[i-1]);
           System.out.println(arr[i]);
           System.out.println(arr[i-1]);
           if(n>h)
           {
            h=n;
           }
        }
        return h;
    }
}